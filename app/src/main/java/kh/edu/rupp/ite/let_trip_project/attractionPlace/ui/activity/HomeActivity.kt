package kh.edu.rupp.ite.let_trip_project.attractionPlace.ui.activity

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import kh.edu.rupp.ite.let_trip_project.attractionPlace.ui.fragment.AccountFragment
import kh.edu.rupp.ite.let_trip_project.attractionPlace.ui.fragment.HomeFragment
import kh.edu.rupp.ite.let_trip_project.attractionPlace.ui.fragment.MoreFragment
import kh.edu.rupp.ite.let_trip_project.ui.activity.BaseActivity
import dagger.hilt.android.AndroidEntryPoint
import kh.edu.rupp.ite.let_trip_project.R
import kh.edu.rupp.ite.let_trip_project.databinding.ActivityHomeBinding

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
//            R.id.searchPage -> {
//                supportFragmentManager.beginTransaction()
//                    .replace(R.id.root_view, AccountFragment()).commit()
//            }
            R.id.bagPage -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.root_view, MoreFragment()).commit()
            }
            R.id.profilePage -> {
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