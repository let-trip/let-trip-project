package com.example.apptravel.attractionPlace.ui.activity

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.apptravel.R
import com.example.apptravel.attractionPlace.ui.fragment.MoreFragment
import com.example.apptravel.databinding.ActivityMoreBinding
import com.example.apptravel.ui.activity.BaseActivity

class MoreActivity: BaseActivity<ActivityMoreBinding>(){
    override fun inflateLayout(): ActivityMoreBinding = ActivityMoreBinding.inflate(layoutInflater)

    override fun getDefaultFragment(): Fragment? = MoreFragment.newInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_more)
        setContentView(binding.root)
    }
}