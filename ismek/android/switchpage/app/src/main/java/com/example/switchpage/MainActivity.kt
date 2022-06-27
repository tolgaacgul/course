package com.example.switchpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn_go)

        btn.setOnClickListener{
            val intent = Intent(this, Ikinci_Ekran::class.java)
            startActivity(intent)
            finish()
        }
    }
}