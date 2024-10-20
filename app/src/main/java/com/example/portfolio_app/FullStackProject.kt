package com.example.portfolio_app

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FullStackProject : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_full_stack_project)

        val webViewWidget = findViewById<WebView>(R.id.webView)
        webViewSetUp(webViewWidget)

    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun webViewSetUp(webView: WebView){

        webView.webViewClient = WebViewClient()

        webView.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://aaditya-kumar-mittal.github.io/int219-frontend-project.github.io/index.html")
        }
    }
}