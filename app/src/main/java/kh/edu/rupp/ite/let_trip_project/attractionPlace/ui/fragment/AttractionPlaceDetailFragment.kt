package kh.edu.rupp.ite.let_trip_project.attractionPlace.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.DEFAULT_ARGS_KEY
import androidx.lifecycle.viewmodel.MutableCreationExtras
import kh.edu.rupp.ite.let_trip_project.attractionPlace.adapter.PhotoSliderAdapter
import kh.edu.rupp.ite.let_trip_project.attractionPlace.dataModel.AttractionPlace
import kh.edu.rupp.ite.let_trip_project.attractionPlace.ui.activity.AttractionPlaceDetailActivity
import kh.edu.rupp.ite.let_trip_project.attractionPlace.ui.activity.WebViewActivity
import kh.edu.rupp.ite.let_trip_project.attractionPlace.viewModel.AttractionPlaceDetailViewModel
import kh.edu.rupp.ite.let_trip_project.ui.fragment.BaseFragment
import kh.edu.rupp.ite.let_trip_project.ui.widget.DelayClickListener
import com.google.android.material.appbar.MaterialToolbar
import kh.edu.rupp.ite.let_trip_project.databinding.FragmentAttractionPlaceDetailBinding


class AttractionPlaceDetailFragment : BaseFragment<FragmentAttractionPlaceDetailBinding>() {

    private var attractionPlace: AttractionPlace? = null
    private val viewModel by viewModels<AttractionPlaceDetailViewModel>(extrasProducer = {
        val bundle = Bundle()
        bundle.putParcelable(AttractionPlaceDetailActivity.ATTRACTION_PLACE, attractionPlace)
        MutableCreationExtras(defaultViewModelCreationExtras).apply {
            set(DEFAULT_ARGS_KEY, bundle)
        }
    })
    override fun getToolbar(): MaterialToolbar? {
        return binding.toolbar
    }

    override fun inflateLayout(
        inflater: LayoutInflater, container: ViewGroup?
    ): FragmentAttractionPlaceDetailBinding {
        return FragmentAttractionPlaceDetailBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        setToolbarTitle(attractionPlace?.name)
        bindImage()
        binding.textviewOfficialUrl.setOnClickListener(DelayClickListener().onDelayClick {
            startActivity(WebViewActivity.newInstance(requireContext(), attractionPlace?.url))
        })
    }


    private fun bindImage(){
        attractionPlace?.run {
            if (images.isNotEmpty()){
                binding.viewPager.adapter = PhotoSliderAdapter(requireActivity(), images)
                binding.apply {
                    binding.viewPager
                }
            }
        }
    }



    companion object {
        fun newInstance(attractionPlace: AttractionPlace?): AttractionPlaceDetailFragment {
            val fragment = AttractionPlaceDetailFragment()
            fragment.attractionPlace = attractionPlace

            return fragment
        }
    }
}
