package com.example.inputcontrol

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ToastView : AppCompatActivity() {
    private lateinit var btnToast: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_toast_view)
        btnToast = findViewById(R.id.buttonToast);
        btnToast.setOnClickListener {
            Toast.makeText(applicationContext, "HALO INI SAMPLE TOAST", Toast.LENGTH_SHORT).show()
        }
    }
}