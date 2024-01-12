package kh.edu.rupp.ite.let_trip_project.attractionPlace.ui.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import kh.edu.rupp.ite.let_trip_project.ui.fragment.BaseFragment
import kh.edu.rupp.ite.let_trip_project.databinding.FragmentAccountBinding

class AccountFragment : BaseFragment<FragmentAccountBinding>(){
    override fun inflateLayout(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentAccountBinding {
        return FragmentAccountBinding.inflate(inflater, container, false)
    }

    companion object {
        fun newInstance(): AccountFragment {
            return AccountFragment()
        }
    }
}