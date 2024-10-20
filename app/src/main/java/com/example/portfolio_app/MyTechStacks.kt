package com.example.portfolio_app

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MyTechStacks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_my_tech_stacks)

        val fullDev = findViewById<CardView>(R.id.fullDev)
        val androidDev = findViewById<CardView>(R.id.androidDev)

        fullDev.setOnClickListener {
            intent = Intent(applicationContext, FullStackProject::class.java)
            startActivity(intent)
        }

        androidDev.setOnClickListener{
            startActivity(Intent(applicationContext, AndroidWidgetsDemo::class.java))
        }

    }

}