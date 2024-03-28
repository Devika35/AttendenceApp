package com.example.attendenceapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignIn : AppCompatActivity() {
    private lateinit var clickSign: Button
    private lateinit var yourName: EditText
    private lateinit var employeeID: EditText
    private lateinit var password: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        clickSign = findViewById(R.id.clickSign)
        yourName = findViewById(R.id.yourName)
        employeeID = findViewById(R.id.employeeID)
        password = findViewById(R.id.password)

        clickSign.setOnClickListener {
            val yourName = yourName.text.toString()
            val employeeId = employeeID.text.toString()
            val password = password.text.toString()
            if (yourName.isNotEmpty() && employeeId.isNotEmpty() && password.isNotEmpty()) {
                val intent = Intent(this, Homepage::class.java)
                startActivity(intent)

            }
            else {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            }

        }
    }
}
