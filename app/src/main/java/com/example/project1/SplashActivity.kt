package com.example.project1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val splashScreen: Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Looper.myLooper()?.let {
            Handler(it).postDelayed({
                val intent = Intent(this, afterSplash::class.java)
                startActivity(intent)
                finish()
            }, splashScreen)
        }

    }
}

