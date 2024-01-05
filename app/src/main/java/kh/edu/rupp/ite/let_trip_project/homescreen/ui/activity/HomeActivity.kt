package kh.edu.rupp.ite.let_trip_project.homescreen.ui.activity

import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import dagger.hilt.android.AndroidEntryPoint
import kh.edu.rupp.ite.let_trip_project.databinding.ActivityHomeBinding
import kh.edu.rupp.ite.let_trip_project.homescreen.adapter.BannerAdapter
import kh.edu.rupp.ite.let_trip_project.homescreen.ui.fragment.HomeFragment
import kh.edu.rupp.ite.let_trip_project.ui.activity.BaseActivity
import java.util.logging.Handler

@AndroidEntryPoint
class HomeActivity : BaseActivity<ActivityHomeBinding> () {


    private lateinit var viewPager2: ViewPager2
    private lateinit var handler: Handler
    private lateinit var  bannerList: ArrayList<Int>
    private lateinit var  adapter: BannerAdapter
    override fun inflateLayout(): ActivityHomeBinding = ActivityHomeBinding.inflate(layoutInflater)

    override fun getDefaultFragment(): Fragment? = HomeFragment.newInstance()
}