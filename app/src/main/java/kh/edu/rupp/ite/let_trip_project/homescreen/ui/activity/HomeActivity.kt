package kh.edu.rupp.ite.let_trip_project.homescreen.ui.activity

import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import kh.edu.rupp.ite.let_trip_project.databinding.ActivityHomeBinding
import kh.edu.rupp.ite.let_trip_project.homescreen.ui.fragment.HomeFragment
import kh.edu.rupp.ite.let_trip_project.ui.activity.BaseActivity
@AndroidEntryPoint
class HomeActivity : BaseActivity<ActivityHomeBinding> () {
    override fun inflateLayout(): ActivityHomeBinding = ActivityHomeBinding.inflate(layoutInflater)

    override fun getDefaultFragment(): Fragment? = HomeFragment.newInstance()
}