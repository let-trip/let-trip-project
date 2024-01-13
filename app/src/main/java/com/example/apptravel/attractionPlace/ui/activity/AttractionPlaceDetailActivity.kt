package com.example.apptravel.attractionPlace.ui.activity

import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.fragment.app.Fragment
import com.example.apptravel.attractionPlace.dataModel.AttractionPlace
import com.example.apptravel.attractionPlace.ui.fragment.AttractionPlaceDetailFragment
import com.example.apptravel.databinding.ActivityAttractionPlaceDetailBinding
import com.example.apptravel.ui.activity.BaseActivity

class AttractionPlaceDetailActivity : BaseActivity<ActivityAttractionPlaceDetailBinding>() {

    override fun inflateLayout(): ActivityAttractionPlaceDetailBinding =
        ActivityAttractionPlaceDetailBinding.inflate(layoutInflater)

    override fun getDefaultFragment(): Fragment? =
        AttractionPlaceDetailFragment.newInstance(getAttractionPlace(intent))

    companion object {

        const val ATTRACTION_PLACE = "ATTRACTION_PLACE"

        fun newInstance(context: Context, attractionPlace: AttractionPlace): Intent {
            val intent = Intent(context, AttractionPlaceDetailActivity::class.java)
            intent.putExtra(ATTRACTION_PLACE, attractionPlace)
            return intent
        }

        private fun getAttractionPlace(argument: Intent?): AttractionPlace? {
            argument?.let {
                return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                    it.getParcelableExtra(ATTRACTION_PLACE, AttractionPlace::class.java)
                } else {
                    it.getParcelableExtra(ATTRACTION_PLACE)
                }
            }

            return null
        }
    }
}