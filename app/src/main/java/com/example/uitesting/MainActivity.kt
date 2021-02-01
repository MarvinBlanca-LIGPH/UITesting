package com.example.uitesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_login.setOnClickListener {
            if (username.text.isNotEmpty() && password.text.length >= 6) {
                Toast.makeText(this@MainActivity, "Login Successful!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@MainActivity, "Login Failed!!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}