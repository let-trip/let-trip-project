package com.example.apptravel.retrofit

import android.content.Context
import android.text.TextUtils
import com.example.apptravel.dataModel.CallAPIResult
import com.example.apptravel.dataModel.ErrorResponse
import com.example.apptravel.utility.AppUtils
import com.example.apptravel.utility.ExtensionUtil.isInternetAvailable
import retrofit2.Response
import timber.log.Timber
import java.net.ConnectException

object ResponseResultParser {

    fun <T> parseResultFromSuccess(context: Context, result: Response<T>): CallAPIResult<T?> {
        return try {
            if (result.isSuccessful) {
                CallAPIResult.createOnSuccess(result.body())
            } else {
                var errorMessage = result.message()
                if (TextUtils.isEmpty(errorMessage)) {
                    errorMessage = AppUtils.toJSONString(result.body()) ?: ""
                }

                if (TextUtils.isEmpty(errorMessage)) {
                    CallAPIResult.createOnFailure(
                        ErrorResponse.generalErrorWithMessage(context)
                    )
                } else {
                    CallAPIResult.createOnFailure(
                        ErrorResponse(
                            result.code().toString(), errorMessage
                        )
                    )
                }
            }
        } catch (ex: Exception) {
            Timber.e(ex)
            if (ex is ConnectException) {
                return if (!context.isInternetAvailable()) {
                    CallAPIResult.createOnFailure(ErrorResponse.noInternetError(context))
                } else {
                    CallAPIResult.createOnFailure(ErrorResponse.connectSererError(context))
                }
            } else {
                CallAPIResult.createOnFailure(
                    ErrorResponse.generalErrorWithMessage(
                        context, ex.message
                    )
                )
            }
        }
    }

    fun <T> parseResultFromException(context: Context, ex: Exception): CallAPIResult<T?> {
        return if (ex is ConnectException) {
            if (!context.isInternetAvailable()) {
                CallAPIResult.createOnFailure(ErrorResponse.noInternetError(context))
            } else {
                CallAPIResult.createOnFailure(ErrorResponse.connectSererError(context))
            }
        } else {
            CallAPIResult.createOnFailure(
                ErrorResponse.generalErrorWithMessage(
                    context, ex.message
                )
            )
        }
    }
}