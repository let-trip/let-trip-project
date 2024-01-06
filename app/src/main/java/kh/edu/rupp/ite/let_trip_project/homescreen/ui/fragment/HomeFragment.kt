package kh.edu.rupp.ite.let_trip_project.homescreen.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import kh.edu.rupp.ite.let_trip_project.databinding.FragmentHomeBinding
import kh.edu.rupp.ite.let_trip_project.ui.fragment.BaseFragment
@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding> (){



    override fun inflateLayout(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.inflate(layoutInflater)

    }

    companion object {
        fun newInstance(): HomeFragment {
            return HomeFragment()
        }
    }
}