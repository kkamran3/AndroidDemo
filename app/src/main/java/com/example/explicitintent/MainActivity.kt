package com.example.explicitintent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.explicitintent.ui.theme.ExplicitIntentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMain = findViewById<Button>(R.id.button)
        val btnWebView = findViewById<Button>(R.id.webView)
        val btnShop = findViewById<Button>(R.id.shop)

        btnMain.setOnClickListener{
            val myIntent = Intent(this, SecondActivity::class.java)
            startActivity(myIntent)
        }

        btnWebView.setOnClickListener {
            val webViewIntent = Intent(this, WebViewActivity::class.java)
            startActivity(webViewIntent)
        }

        btnShop.setOnClickListener {
            val shopIntent = Intent(this, ShopActivity::class.java)
            startActivity(shopIntent)
        }
    }
}
