package kh.edu.rupp.ite.let_trip_project.application

import android.app.Application
import com.facebook.shimmer.BuildConfig.DEBUG
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        if (DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}