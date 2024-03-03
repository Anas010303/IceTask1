package com.example.ice1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    private val splashDelay: Long = 3000 // 3 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Check if the activity is the task root
        if (isTaskRoot && intent.hasCategory("android.intent.category.LAUNCHER")) {
            setContentView(R.layout.activity_splash)

            Handler().postDelayed({
                val intent = Intent(this, HelloWorldActivity::class.java)
                startActivity(intent)
                finish()
            }, splashDelay)
        } else {
            // If not the task root, finish the activity
            finish()
        }
    }
}

