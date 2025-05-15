package com.example.lab3_

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var messageInput: EditText
    private lateinit var sendInternalButton: Button
    private lateinit var sendExternalButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        messageInput = findViewById(R.id.message_input)
        sendInternalButton = findViewById(R.id.send_internal_button)
        sendExternalButton = findViewById(R.id.send_external_button)

        // Варіант А: Відправка у нове вікно
        sendInternalButton.setOnClickListener {
            val message = messageInput.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("message_key", message)
            startActivity(intent)
        }

        // Варіант Б: Відправка через інші додатки
        sendExternalButton.setOnClickListener {
            val message = messageInput.text.toString()
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, message)
            }
            val chooser = Intent.createChooser(intent, "Поділитися через...")
            startActivity(chooser)
        }
    }
}