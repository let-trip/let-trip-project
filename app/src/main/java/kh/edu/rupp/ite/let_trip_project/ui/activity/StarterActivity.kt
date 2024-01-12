package kh.edu.rupp.ite.let_trip_project.ui.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import kh.edu.rupp.ite.let_trip_project.R
import kh.edu.rupp.ite.let_trip_project.attractionPlace.ui.activity.HomeActivity
@Suppress("DEPRECATION")
class StarterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_starter)
        startActivity(Intent(this, HomeActivity::class.java))
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        Handler(Looper.getMainLooper()).postDelayed({
        }, 2000)
    }
}

