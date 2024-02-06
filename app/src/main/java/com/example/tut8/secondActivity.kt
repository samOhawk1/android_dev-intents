package com.example.tut8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var button = findViewById<Button>(R.id.button2)
        button.setOnClickListener{

            intent = Intent(applicationContext, thirdActivity::class.java)
            startActivity(intent)
        }
    }
}