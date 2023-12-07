package kh.edu.rupp.ite.let_trip_project.homescreen.repository

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import kh.edu.rupp.ite.let_trip_project.homescreen.api.CategoriesAPI
import javax.inject.Inject

class CategoriesRepository @Inject constructor(
    @ApplicationContext private val context: Context, private val apiService: CategoriesAPI
) {
    private var page = DEFAULT_PAGE


    private fun resetPagination() {
        page = DEFAULT_PAGE
    }



    companion object {
        private const val DEFAULT_PAGE = 1
        const val DEFAULT_LIMIT_PER_PAGE = 30
    }
}