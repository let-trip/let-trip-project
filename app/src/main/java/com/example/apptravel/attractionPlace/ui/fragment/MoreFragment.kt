package com.example.apptravel.attractionPlace.ui.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.apptravel.databinding.FragmentMoreBinding
import com.example.apptravel.ui.fragment.BaseFragment

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