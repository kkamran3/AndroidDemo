package com.example.explicitintent

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OrderDeliveryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_delivery)

        val tView = findViewById<TextView>(R.id.textView)

        val ordersPlaced = intent.getStringExtra(ShopActivity.KEY)
        tView.text = ordersPlaced.toString()
    }
}