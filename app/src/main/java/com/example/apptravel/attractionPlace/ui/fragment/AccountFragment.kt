package com.example.apptravel.attractionPlace.ui.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.apptravel.databinding.FragmentAccountBinding
import com.example.apptravel.ui.fragment.BaseFragment

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