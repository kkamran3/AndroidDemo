package com.example.explicitintent

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ShopActivity : ComponentActivity() {
    companion object {
        const val KEY = "com.example.ExplicitIntent.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)

        val editT1 = findViewById<EditText>(R.id.eT1)
        val editT2 = findViewById<EditText>(R.id.eT2)
        val editT3 = findViewById<EditText>(R.id.eT3)
        val editT4 = findViewById<EditText>(R.id.eT4)
        val orderButton = findViewById<Button>(R.id.btnOrder)


        orderButton.setOnClickListener {
            val orderItems = editT1.text.toString() + ' ' + editT2.text.toString() + ' ' +
                    editT3.text.toString() + ' ' + editT4.text.toString()
            val intent = Intent(this, OrderDeliveryActivity::class.java )
            intent.putExtra(KEY, orderItems)
            startActivity(intent)
        }

    }
}