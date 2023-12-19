package kh.edu.rupp.ite.let_trip_project.homescreen.dataModel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CategoriesDataModel(
    @SerializedName("id") val id: String

    ) : Parcelable
