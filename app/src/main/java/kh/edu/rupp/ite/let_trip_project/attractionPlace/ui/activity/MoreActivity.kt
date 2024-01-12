package kh.edu.rupp.ite.let_trip_project.attractionPlace.ui.activity

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import kh.edu.rupp.ite.let_trip_project.attractionPlace.ui.fragment.MoreFragment
import kh.edu.rupp.ite.let_trip_project.ui.activity.BaseActivity
import kh.edu.rupp.ite.let_trip_project.R
import kh.edu.rupp.ite.let_trip_project.databinding.ActivityMoreBinding

class MoreActivity: BaseActivity<ActivityMoreBinding>(){
    override fun inflateLayout(): ActivityMoreBinding = ActivityMoreBinding.inflate(layoutInflater)

    override fun getDefaultFragment(): Fragment? = MoreFragment.newInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_more)
        setContentView(binding.root)
    }
}