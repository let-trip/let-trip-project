package com.example.apptravel.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.example.apptravel.R.id

abstract class BaseActivity<B : ViewDataBinding> : AppCompatActivity() {

    protected lateinit var binding: B
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflateLayout()
        setContentView(binding.root)
        navigateToDefaultFragment()
    }

    protected abstract fun inflateLayout(): B

    protected fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(getRootContainerId(), fragment, fragment.javaClass.simpleName).commit()
    }

    protected open fun getRootContainerId(): Int {
        return id.root_view
    }

    private fun navigateToDefaultFragment() {
        getDefaultFragment()?.let {
            replaceFragment(it)
        }
    }

    protected abstract fun getDefaultFragment(): Fragment?
}