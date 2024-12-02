package com.example.my_login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val welcomeMessage = findViewById<TextView>(R.id.welcomeTextView)
        val email = intent.getStringExtra("email")
        welcomeMessage.text = "Bienvenue, $email !"
    }
}
