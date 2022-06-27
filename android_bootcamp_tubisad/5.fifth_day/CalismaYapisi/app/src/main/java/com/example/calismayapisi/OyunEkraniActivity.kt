package com.example.calismayapisi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calismayapisi.databinding.ActivityMainBinding
import com.example.calismayapisi.databinding.ActivityOyunEkraniBinding

class OyunEkraniActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityOyunEkraniBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityOyunEkraniBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

    }
}