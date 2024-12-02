package com.example.my_login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {

    // Déclarer les variables pour les vues
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var signInButton: Button
    private lateinit var signUpLink: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)  // Le nom de votre fichier XML

        // Initialisation des éléments de l'interface utilisateur
        emailEditText = findViewById(R.id.emailEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        signInButton = findViewById(R.id.signInButton)
        signUpLink = findViewById(R.id.signUpLink)

        // Configurer le bouton de connexion
        signInButton.setOnClickListener {
            val email = emailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            // Validation des champs (ajoutez des validations supplémentaires selon vos besoins)
            if (email.isEmpty()) {
                emailEditText.error = "Email is required"
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                passwordEditText.error = "Password is required"
                return@setOnClickListener
            }

            // Simuler une vérification de connexion (vous pouvez remplacer cette logique par une vérification réelle)
            if (email == "user@example.com" && password == "password123") {
                // Connexion réussie, passer à l'activité principale (MainActivity)
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()  // Fermer l'écran de connexion
            } else {
                // Afficher un message d'erreur si la connexion échoue
                Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show()
            }
        }

        // Lien pour s'inscrire si l'utilisateur n'a pas de compte
        signUpLink.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}
