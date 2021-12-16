package com.example.peakcomminssioncodeethics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashscreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)


        val backgroundImg : ImageView = findViewById(R.id.peak_logo)
        val sideAnimation = AnimationUtils.loadAnimation(this,R.anim.slide)
        backgroundImg.startAnimation(sideAnimation)

        Handler().postDelayed({

            startActivity(Intent(this,MainActivity::class.java))
            finish()

        },5000)//delaying 5 seconds
    }
}