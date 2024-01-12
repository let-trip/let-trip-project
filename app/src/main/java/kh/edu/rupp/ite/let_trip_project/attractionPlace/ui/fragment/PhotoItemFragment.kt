package kh.edu.rupp.ite.let_trip_project.attractionPlace.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kh.edu.rupp.ite.let_trip_project.ui.fragment.BaseFragment
import kh.edu.rupp.ite.let_trip_project.utility.ExtensionUtil.loadImageView
import kh.edu.rupp.ite.let_trip_project.databinding.FragmentPhotoItemBinding

class PhotoItemFragment : BaseFragment<FragmentPhotoItemBinding>() {

    private var photoUrl: String? = null

    override fun inflateLayout(
        inflater: LayoutInflater, container: ViewGroup?
    ): FragmentPhotoItemBinding = FragmentPhotoItemBinding.inflate(layoutInflater, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        photoUrl?.let {
            binding.imageview.loadImageView(it, false)
        }
    }

    companion object {

        fun newInstance(photoUrl: String): PhotoItemFragment {
            val fragment = PhotoItemFragment()
            fragment.photoUrl = photoUrl

            return fragment
        }
    }
}