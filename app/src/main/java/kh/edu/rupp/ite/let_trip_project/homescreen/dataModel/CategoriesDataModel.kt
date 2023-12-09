package kh.edu.rupp.ite.let_trip_project.homescreen.dataModel

import android.os.Parcel
import android.os.Parcelable
import com.android.tools.r8.internal.id
import com.google.gson.annotations.SerializedName
import kh.edu.rupp.ite.let_trip_project.Model.BaseDiffModel
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CategoriesDataModel(
    @SerializedName("id") val id: String

    ) : BaseDiffModel, Parcelable {


    override fun getItemId(): String = id


}