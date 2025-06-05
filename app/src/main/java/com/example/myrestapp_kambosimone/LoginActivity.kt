package com.example.myrestapp_kambosimone

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import java.security.MessageDigest

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val btnlogin = findViewById<Button>(R.id.btnLogin)

        btnlogin.setOnClickListener {
            val nomeUtente = findViewById<EditText>(R.id.nomeUtente).text.toString()
            val password = sha256(findViewById<EditText>(R.id.password).text.toString())

            if(nomeUtente == "simone" && password == "10eb4c9dfdf432467d545ae13563a3a2a6010d0f0b21f2e06224d3ee415fd458"){ //kambo cifrato
                val mioIntent = Intent(this, MenuActivity::class.java)
                startActivity(mioIntent)
            }
            else{
                val mioToast = Toast.makeText(this, "Password o bnome utente sbagliati", Toast.LENGTH_LONG)
                mioToast.show()
            }
        }
    }

    private fun sha256(input: String): String {
        val bytes = MessageDigest.getInstance("SHA-256").digest(input.toByteArray())
        return bytes.joinToString("") { "%02x".format(it) }
    }
}