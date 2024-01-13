package com.example.apptravel.attractionPlace.ui.activity

import androidx.fragment.app.Fragment
import com.example.apptravel.attractionPlace.ui.fragment.AccountFragment
import com.example.apptravel.databinding.ActivityAccountBinding
import com.example.apptravel.ui.activity.BaseActivity

class AccountActivity : BaseActivity<ActivityAccountBinding> (){
    override fun inflateLayout(): ActivityAccountBinding = ActivityAccountBinding.inflate(layoutInflater)

    override fun getDefaultFragment(): Fragment? = AccountFragment.newInstance()
}