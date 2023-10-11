package com.example.projekt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.projekt.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class Create : AppCompatActivity() {
    private val mAuth: FirebaseAuth = FirebaseAuth.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)
        try {
            val emailtext = findViewById<EditText>(R.id.Create_email)
            val email = emailtext.text.toString()

            val passwordd = findViewById<EditText>(R.id.Create_password)
            val password = passwordd.text.toString()
            val Button_to_create = findViewById<Button>(R.id.Create)
            val mAuth = FirebaseAuth.getInstance()

            mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    Button_to_create.setOnClickListener {


                        if (task.isSuccessful) {
                            val user = mAuth.currentUser
                        } else {
                            Toast.makeText(
                                this,
                                "Błąd rejestracji " + task.exception?.message,
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                }
        }
        catch (e: Exception)
        {
            e.printStackTrace()
        }
    }
    override fun onStart(){
        super.onStart()
        isCurrentUser()
    }

    private fun isCurrentUser() {
        
    }
}