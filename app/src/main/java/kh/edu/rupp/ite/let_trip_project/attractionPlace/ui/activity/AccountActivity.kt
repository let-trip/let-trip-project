package kh.edu.rupp.ite.let_trip_project.attractionPlace.ui.activity

import androidx.fragment.app.Fragment
import kh.edu.rupp.ite.let_trip_project.attractionPlace.ui.fragment.AccountFragment
import kh.edu.rupp.ite.let_trip_project.ui.activity.BaseActivity
import kh.edu.rupp.ite.let_trip_project.databinding.ActivityAccountBinding

class AccountActivity : BaseActivity<ActivityAccountBinding>(){
    override fun inflateLayout(): ActivityAccountBinding = ActivityAccountBinding.inflate(layoutInflater)

    override fun getDefaultFragment(): Fragment? = AccountFragment.newInstance()
}