package com.example.sampleloginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginButtonClick()
    }

    private fun loginButtonClick() {
        val buttonId = findViewById<Button>(R.id.btnLogin)
        buttonId.setOnClickListener {
            if(findViewById<TextView>(R.id.txtUserName).text.isNotEmpty() && findViewById<TextView>(R.id.txtPassword).text.isNotEmpty()) {
                Toast.makeText(this, "We'll verify and get back to you, Thank you", Toast.LENGTH_LONG).show()
                findViewById<TextView>(R.id.txtUserName).text = ""
                findViewById<TextView>(R.id.txtPassword).text = ""
            } else {
                Toast.makeText(this, "Please enter Username and Password", Toast.LENGTH_LONG).show()
            }
        }
    }
}