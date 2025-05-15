package com.example.lab3_

import android.os.Bundle
import android.view.Gravity
import android.util.TypedValue
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this)

        // Встановлюємо гравітацію тексту по центру
        textView.gravity = Gravity.CENTER

        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24f)

        setContentView(textView)

        val message = intent.getStringExtra("message_key")
        textView.text = "Отримане повідомлення:\n$message"
    }
}