package com.example.cs455_termproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ElementActivity : AppCompatActivity() {

    private lateinit var iD : String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_element)
        val intent = intent;
        iD = intent.getStringExtra("iD").toString()

    }

}