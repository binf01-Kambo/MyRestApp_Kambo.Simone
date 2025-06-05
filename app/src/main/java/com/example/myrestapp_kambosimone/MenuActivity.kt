package com.example.myrestapp_kambosimone

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val btnWebView = findViewById<ImageButton>(R.id.btnWebView)
        val btnCercaFilm = findViewById<ImageButton>(R.id.btnCercaFilm)

        btnWebView.setOnClickListener {
            val mioIntent = Intent(this, WebViewActivity::class.java)
            startActivity(mioIntent)
        }

        btnCercaFilm.setOnClickListener {
            val mioIntent = Intent(this, SearchActivity::class.java)
            startActivity(mioIntent)
        }
    }
}