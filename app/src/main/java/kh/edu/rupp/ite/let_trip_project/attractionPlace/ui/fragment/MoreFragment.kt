package kh.edu.rupp.ite.let_trip_project.attractionPlace.ui.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import kh.edu.rupp.ite.let_trip_project.ui.fragment.BaseFragment
import kh.edu.rupp.ite.let_trip_project.databinding.FragmentMoreBinding

class MoreFragment: BaseFragment<FragmentMoreBinding>() {
    override fun inflateLayout(inflater: LayoutInflater, container: ViewGroup?
    ): FragmentMoreBinding {
        return FragmentMoreBinding.inflate(inflater,container,false)
    }

    companion object {
        fun newInstance(): MoreFragment {
            return MoreFragment()
        }
    }
}