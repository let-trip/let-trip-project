package kh.edu.rupp.ite.let_trip_project.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import kh.edu.rupp.ite.let_trip_project.R

abstract class BaseActivity <B : ViewDataBinding> : AppCompatActivity(){

    protected lateinit var biding: B

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        biding = inflateLayout()
        setContentView(biding.root)
        navigateToDefaultFragment()
    }

    protected abstract fun inflateLayout(): B


    protected fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(getRootContainerId(), fragment, fragment.javaClass.simpleName).commit()
    }
    protected open fun getRootContainerId(): Int {
        return R.id.root_view
    }


    private fun navigateToDefaultFragment() {
        getDefaultFragment()?.let {
            replaceFragment(it)
        }
    }
    protected abstract fun getDefaultFragment(): Fragment?
}