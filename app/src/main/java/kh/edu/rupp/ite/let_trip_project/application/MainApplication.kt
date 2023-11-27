package kh.edu.rupp.ite.let_trip_project.application

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import kh.edu.rupp.ite.let_trip_project.BuildConfig
import timber.log.Timber


@HiltAndroidApp
class MainApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }
    }

}