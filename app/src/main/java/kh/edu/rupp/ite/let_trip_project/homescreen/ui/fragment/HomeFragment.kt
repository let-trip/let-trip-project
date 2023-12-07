package kh.edu.rupp.ite.let_trip_project.homescreen.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import kh.edu.rupp.ite.let_trip_project.R
import kh.edu.rupp.ite.let_trip_project.R.*
import kh.edu.rupp.ite.let_trip_project.ViewModel.LoadingContentViewModel
import kh.edu.rupp.ite.let_trip_project.databinding.FragmentHomeBinding
import kh.edu.rupp.ite.let_trip_project.homescreen.viewModel.HomeViewModel
import kh.edu.rupp.ite.let_trip_project.ui.fragment.BaseFragment
@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding> (){

    private val viewModel by viewModels <HomeViewModel>()

    private val loadingContentViewModel by viewModels<LoadingContentViewModel>()

    override fun inflateLayout(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.bindLoadingContentViewModel(loadingContentViewModel)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        binding.root.post{
            binding.loadingContentSkeleton.setUpView(
                loadingContentViewModel,
                layout.list_item_skeleton_categories, 5
            )
        }
        binding.root.post {
            binding.loadingContentSkeleton.setUpView(
                loadingContentViewModel,
                R.layout.list_item_skeleton_near_you, 5
            )
        }
        binding.root.post {
            binding.loadingContentSkeleton.setUpView(
                loadingContentViewModel,
                R.layout.list_item_skeleton_popular_destination, 5
            )
        }

    }

    companion object {
        fun newInstance(): HomeFragment {
            return HomeFragment()
        }
    }
}