package com.example.apptravel.attractionPlace.ui.activity

import android.content.Context
import android.content.Intent
import androidx.fragment.app.Fragment
import com.example.apptravel.attractionPlace.ui.fragment.WebViewFragment
import com.example.apptravel.databinding.ActivityWebViewBinding
import com.example.apptravel.ui.activity.BaseActivity

class WebViewActivity : BaseActivity<ActivityWebViewBinding>() {

    override fun inflateLayout(): ActivityWebViewBinding =
        ActivityWebViewBinding.inflate(layoutInflater)

    override fun getDefaultFragment(): Fragment? =
        WebViewFragment.newInstance(getUrl(intent))

    companion object {

        private const val URL = "URL"

        fun newInstance(context: Context, url: String?): Intent {
            val intent = Intent(context, WebViewActivity::class.java)
            intent.putExtra(URL, url)
            return intent
        }

        private fun getUrl(argument: Intent?): String? {
            argument?.let {
                return it.getStringExtra(URL)
            }

            return null
        }
    }
}