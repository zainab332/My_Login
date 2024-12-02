package com.example.my_login

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {

    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var signUpButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // Initialisation des éléments UI
        emailEditText = findViewById(R.id.emailEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        signUpButton = findViewById(R.id.signUpButton)

        // Action pour Sign Up
        signUpButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Vérification des entrées (ajoutez des vérifications supplémentaires comme les contraintes sur le mot de passe, etc.)
            if (email.isNotEmpty() && password.isNotEmpty()) {
                // Simuler l'enregistrement de l'utilisateur (par exemple, dans un fichier, base de données, etc.)
                // Vous pouvez également ajouter une logique pour vérifier la validité de l'email et du mot de passe

                Toast.makeText(this, "Account created successfully!", Toast.LENGTH_SHORT).show()

                // Après l'inscription, revenir à l'écran de connexion
                finish()  // Fermer l'activité d'inscription
            } else {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
