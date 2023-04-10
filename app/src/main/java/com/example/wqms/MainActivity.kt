package com.example.wqms

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import com.example.wqms.R

class MainActivity : AppCompatActivity() {
    private lateinit var myWebView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get a reference to the WebView element in the layout
        myWebView = findViewById(R.id.webView)

        // Enable JavaScript in the WebView
        val webSettings: WebSettings = myWebView.settings
        webSettings.javaScriptEnabled = true

        // Load the HTML page
        myWebView.loadUrl("file:///android_asset/main.html")

        // Execute the JavaScript code in the web page
        myWebView.evaluateJavascript("updateSensorValues();", null)
    }
}