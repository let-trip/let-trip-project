package kh.edu.rupp.ite.let_trip_project.homescreen.api

import kh.edu.rupp.ite.let_trip_project.Model.BaseAPIResponse
import kh.edu.rupp.ite.let_trip_project.homescreen.dataModel.CategoriesDataModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CategoriesAPI {

    @GET("")
    suspend fun getCategories(
        @Path("lang") languageCode: String, @Query("page") page: Int
    ): Response<BaseAPIResponse<List<CategoriesDataModel>>>

}

