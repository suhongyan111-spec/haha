package com.example.screentranslator

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(android.R.layout.simple_list_item_1)

        // Minimal UI: start floating service button (not using layout file to keep project simple)
        val btn = Button(this).apply { text = "Start Floating" }
        setContentView(btn)
        btn.setOnClickListener {
            if (!Settings.canDrawOverlays(this)) {
                startActivity(Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION))
                return@setOnClickListener
            }
            startService(Intent(this, FloatingService::class.java))
        }
    }
}
