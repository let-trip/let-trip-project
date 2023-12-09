package kh.edu.rupp.ite.let_trip_project.Model

import com.google.gson.annotations.SerializedName

data class BaseAPIResponse<D>(
    @SerializedName("total") val total: Int, @SerializedName("data") val data: D
)