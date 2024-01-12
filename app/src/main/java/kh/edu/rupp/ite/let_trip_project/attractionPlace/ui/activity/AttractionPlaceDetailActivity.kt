package kh.edu.rupp.ite.let_trip_project.attractionPlace.ui.activity

import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.fragment.app.Fragment
import kh.edu.rupp.ite.let_trip_project.attractionPlace.dataModel.AttractionPlace
import kh.edu.rupp.ite.let_trip_project.attractionPlace.ui.fragment.AttractionPlaceDetailFragment
import kh.edu.rupp.ite.let_trip_project.ui.activity.BaseActivity
import kh.edu.rupp.ite.let_trip_project.databinding.ActivityAttractionPlaceDetailBinding

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