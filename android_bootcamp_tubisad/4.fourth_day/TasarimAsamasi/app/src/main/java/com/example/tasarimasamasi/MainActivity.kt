package com.example.tasarimasamasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // kodlama içerisinde res klasörünü R harfi temsiz eder.
    // xml içerisinde @ temsil eder
}