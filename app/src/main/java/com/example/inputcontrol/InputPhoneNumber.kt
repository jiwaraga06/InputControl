package com.example.inputcontrol

import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class InputPhoneNumber : AppCompatActivity() {
    private lateinit var inputPhoneEdit: TextInputEditText
    private lateinit var buttonSubmit: Button
    private lateinit var txtResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_input_phone_number)
        buttonSubmit = findViewById(R.id.btnSubmit)
        txtResult = findViewById(R.id.textResult)
        inputPhoneEdit = findViewById(R.id.inputPhoneEdit)
        buttonSubmit.setOnClickListener {
            submit()
        }

    }

    private fun submit()
    {
        var message = inputPhoneEdit.text;
        txtResult.text = "Nomor kamu adalah : $message"
    }
}