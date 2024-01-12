package kh.edu.rupp.ite.let_trip_project.attractionPlace.dataModel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kh.edu.rupp.ite.let_trip_project.dataModel.BaseDiffModel
import kotlinx.parcelize.Parcelize

@Parcelize
data class AttractionPlace(
    @SerializedName("id") val id: String,
    @SerializedName("name") val name: String,
    @SerializedName("address") val address: String,
    @SerializedName("introduction") val introduction: String,
    @SerializedName("modified") val lastModifiedData: String,
    @SerializedName("url") val url: String,
    @SerializedName("images") val images: List<Photo> = mutableListOf(),
) : BaseDiffModel, Parcelable {
    override fun getItemId(): String = id
}