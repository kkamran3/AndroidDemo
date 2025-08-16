package com.example.explicitintent

import android.content.Intent
import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.cardview.widget.CardView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.explicitintent.ui.theme.ExplicitIntentTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val webButton = findViewById<CardView>(R.id.cardWeb)
        val cameraButton = findViewById<CardView>(R.id.cardCamera)

        webButton.setOnClickListener {

        }

        cameraButton.setOnClickListener {

        }
    }
}
