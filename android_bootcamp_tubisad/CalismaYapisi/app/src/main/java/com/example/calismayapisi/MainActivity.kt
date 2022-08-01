package com.example.calismayapisi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.calismayapisi.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_oyun_ekrani.*

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)
        // backStack- geri gelerek son yapıyı görürüz

        /*
        tasarim.btn_start.setOnClickListener{
            Snackbar.make(it, "Selam", Snackbar.LENGTH_SHORT).show();
        }
         */

        Log.e("Yaşam Döngüsü", "OnCreate Kısmını çok güzel çalıştırdık")
    }

    override fun onStart() {
        super.onStart()
        Log.e("Yaşam Döngüsü", "Onstart Kısmını çok güzel çalıştırdık")

    }

    override fun onResume() {
        super.onResume()
        Log.e("Yaşam Döngüsü", "OnResume Kısmını çok güzel çalıştırdık")

    }

    override fun onPause() {
        super.onPause()
        Log.e("Yaşam Döngüsü", "Onpause Kısmını çok güzel çalıştırdık")

    }

    override fun onStop() {
        super.onStop()
        Log.e("Yaşam Döngüsü", "OnStop Kısmını çok güzel çalıştırdık")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Yaşam Döngüsü", "OnDestroy Kısmını çok güzel çalıştırdık")

    }

    override fun onRestart() {
        super.onRestart()
        Log.e("Yaşam Döngüsü", "OnRestart Kısmını çok güzel çalıştırdık")

    }
}