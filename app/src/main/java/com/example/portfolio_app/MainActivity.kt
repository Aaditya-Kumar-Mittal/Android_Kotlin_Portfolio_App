package com.example.portfolio_app

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val myBtn = findViewById<Button>(R.id.myButton)

        myBtn.setOnClickListener {
            val moreAboutMe = Intent(applicationContext, MoreAboutMe::class.java)
            startActivity(moreAboutMe)
        }

        val mobile = findViewById<TextView>(R.id.myPhone)

        mobile.setOnClickListener {
            val myNumber = mobile.text
            //Pass the phone number to implicit intent
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:$myNumber")
            }

            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }

        // Find the button by its ID (assuming myName is a Button)
        val myName = findViewById<TextView>(R.id.boloNaam)

        // Set up the click listener to play the audio file from raw directory
        myName.setOnClickListener {
            // Release any previously created MediaPlayer to avoid resource leaks
            if (::mediaPlayer.isInitialized) {
                mediaPlayer.release()
            }

            // Create a new MediaPlayer instance for the audio file in the raw folder
            mediaPlayer = MediaPlayer.create(this, R.raw.bolonaam)

            // Start playing the audio
            mediaPlayer.start()
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        // Release MediaPlayer when the activity is destroyed
        if (::mediaPlayer.isInitialized) {
            mediaPlayer.release()
        }
    }
}