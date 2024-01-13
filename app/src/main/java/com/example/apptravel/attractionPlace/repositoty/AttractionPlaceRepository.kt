package com.example.apptravel.attractionPlace.repositoty

import android.content.Context
import com.example.apptravel.R
import com.example.apptravel.attractionPlace.api.AttractionPlaceAPI
import com.example.apptravel.attractionPlace.dataModel.AttractionPlace
import com.example.apptravel.attractionPlace.dataModel.DisplayLanguageType
import com.example.apptravel.dataModel.CallAPIResult
import com.example.apptravel.retrofit.ResponseResultParser
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class AttractionPlaceRepository @Inject constructor(
    @ApplicationContext private val context: Context, private val apiService: AttractionPlaceAPI
) {
    private var page = DEFAULT_PAGE

    suspend fun getAttractionPlaceList(
        languageCode: String = DisplayLanguageType.ENGLISH.code, isLoadMore: Boolean = false
    ): Flow<CallAPIResult<List<AttractionPlace>?>> {
        if (isLoadMore) {
            page++
        } else {
            resetPagination()
        }

        return flow {
            try {
                val parsedResultFromSuccess = ResponseResultParser.parseResultFromSuccess(
                    context, apiService.getAttractionPlace(languageCode, page)
                )
                if (parsedResultFromSuccess.isSuccess()) {
                    parsedResultFromSuccess.onSuccess {
                        emit(CallAPIResult.createOnSuccess(it?.data))
                    }
                } else {
                    parsedResultFromSuccess.onFailure { error ->
                        emit(CallAPIResult.createOnFailure(error))
                    }
                }
            } catch (ex: Exception) {
                emit(ResponseResultParser.parseResultFromException(context, ex))
            }
        }
    }

    private fun resetPagination() {
        page = DEFAULT_PAGE
    }

    fun getNoDataErrorMessage(): String = context.getString(R.string.error_no_data)


    companion object {
        private const val DEFAULT_PAGE = 1
        const val DEFAULT_LIMIT_PER_PAGE = 30
    }
}