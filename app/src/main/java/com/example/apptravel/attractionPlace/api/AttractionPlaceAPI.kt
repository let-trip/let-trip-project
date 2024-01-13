package com.example.apptravel.attractionPlace.api

import com.example.apptravel.attractionPlace.dataModel.AttractionPlace
import com.example.apptravel.dataModel.BaseAPIResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AttractionPlaceAPI {

    @GET("{lang}/Attractions/All")
    suspend fun getAttractionPlace(
        @Path("lang") languageCode: String, @Query("page") page: Int
    ): Response<BaseAPIResponse<List<AttractionPlace>>>

}

