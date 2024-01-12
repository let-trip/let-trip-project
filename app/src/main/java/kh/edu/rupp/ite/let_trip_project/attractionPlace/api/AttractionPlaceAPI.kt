package kh.edu.rupp.ite.let_trip_project.attractionPlace.api

import kh.edu.rupp.ite.let_trip_project.attractionPlace.dataModel.AttractionPlace
import kh.edu.rupp.ite.let_trip_project.dataModel.BaseAPIResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AttractionPlaceAPI {

    @GET("api/en/Attractions/All")
    suspend fun getAttractionPlace(
        @Path("lang") languageCode: String, @Query("page") page: Int
    ): Response<BaseAPIResponse<List<AttractionPlace>>>

}

