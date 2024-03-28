package com.example.attendenceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class Homepage : AppCompatActivity() {
    private lateinit var details: ImageButton
    private lateinit var main: ImageButton
    private lateinit var profile: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        details=findViewById(R.id.details)
        details.setOnClickListener {
            val intent = Intent(this,Details ::class.java)
            startActivity(intent)
        }
        main=findViewById(R.id.main)
        main.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        }
        profile=findViewById(R.id.profile)
        profile.setOnClickListener {
            val intent = Intent(this,EmployeeDetails ::class.java)
            startActivity(intent)
        }
    }
}
