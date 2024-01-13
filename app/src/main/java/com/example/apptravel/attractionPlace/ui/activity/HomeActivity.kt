package com.example.apptravel.attractionPlace.ui.activity

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.apptravel.R
import com.example.apptravel.attractionPlace.ui.fragment.AccountFragment
import com.example.apptravel.attractionPlace.ui.fragment.HomeFragment
import com.example.apptravel.attractionPlace.ui.fragment.MoreFragment
import com.example.apptravel.databinding.ActivityHomeBinding
import com.example.apptravel.ui.activity.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : BaseActivity<ActivityHomeBinding>() {
    private var previousMenuId: Int? = null
    private var currentMenuId: Int = R.id.homePage

    override fun inflateLayout(): ActivityHomeBinding = ActivityHomeBinding.inflate(layoutInflater)
    override fun getDefaultFragment(): Fragment? = HomeFragment.newInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        setContentView(binding.root)

        init()
    }
    private fun init() {
        binding.bnHome.itemIconTintList = null

        supportFragmentManager.beginTransaction()
            .replace(R.id.root_view, HomeFragment()).commit()

        binding.bnHome.setOnItemSelectedListener { item ->
            navTo(item.itemId)
            true
        }
        binding.bnHome.setOnItemReselectedListener { }
    }
    private fun navTo(menuItemId: Int) {
        previousMenuId = currentMenuId
        currentMenuId = menuItemId

        when (menuItemId) {
            R.id.homePage -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.root_view, HomeFragment()).commit()
            }
            R.id.morePage -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.root_view, MoreFragment()).commit()
            }
            R.id.accountPage -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.root_view, AccountFragment()).commit()
            }
        }
    }

    fun backToPrevious() {
        previousMenuId?.apply {
            currentMenuId = this
            binding.bnHome.selectedItemId = currentMenuId
        }
    }
}