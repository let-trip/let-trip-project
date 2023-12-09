package kh.edu.rupp.ite.let_trip_project.homescreen.adapter

import android.annotation.SuppressLint
import android.os.Parcel
import android.os.Parcelable
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kh.edu.rupp.ite.let_trip_project.adapter.BaseLoadMoreAdapter
import kh.edu.rupp.ite.let_trip_project.homescreen.dataModel.CategoriesDataModel

@SuppressLint("ParcelCreator")
class CategoriesAdapter(data: ArrayList<CategoriesDataModel> = arrayListOf()) :
    BaseLoadMoreAdapter<CategoriesDataModel>(data), Parcelable {

//    private var onItemClickCallback: ((Int, CategoriesDataModel) -> Unit)? = null


    override fun onCreateChildViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }


    override fun onBindChildViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

//    fun onItemClickCallback(callback: (Int, CategoriesDataModel) -> Unit) {
//        this.onItemClickCallback = callback
//    }

//    class ItemViewHolder(private val binding: ListItemCategoriesBinding) :
//        RecyclerView.ViewHolder(binding.root) {
//    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }


}