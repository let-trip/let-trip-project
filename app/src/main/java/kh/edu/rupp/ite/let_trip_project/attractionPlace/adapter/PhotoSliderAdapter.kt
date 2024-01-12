package kh.edu.rupp.ite.let_trip_project.attractionPlace.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import kh.edu.rupp.ite.let_trip_project.attractionPlace.dataModel.Photo
import kh.edu.rupp.ite.let_trip_project.attractionPlace.ui.fragment.PhotoItemFragment

class PhotoSliderAdapter(
    fa: FragmentActivity, private val data: List<Photo>
) : FragmentStateAdapter(fa) {

    override fun getItemCount() = data.size

    override fun createFragment(position: Int): Fragment {
        return PhotoItemFragment.newInstance(data[position].url ?: "")
    }
}