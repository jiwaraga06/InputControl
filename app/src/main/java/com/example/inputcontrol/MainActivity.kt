package com.example.inputcontrol

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var buttonShowToast: Button
    private lateinit var buttonInputPhoneNumber: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        buttonShowToast = findViewById<Button>(R.id.buttonShowToast)
        buttonInputPhoneNumber = findViewById<Button>(R.id.buttonShowInputPhone)
        buttonShowToast.setOnClickListener{
            val intentDestination = Intent(this@MainActivity, ToastView::class.java)
            startActivity(intentDestination)
        }
        buttonInputPhoneNumber.setOnClickListener{
            val intentDestination = Intent(this@MainActivity, InputPhoneNumber::class.java)
            startActivity(intentDestination)
        }

    }
}