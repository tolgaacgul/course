package com.unispry.mvvmkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.unispry.mvvmkullanimi.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = DataBindingUtil.setContentView(this, R.layout.activity_main)
        // butonlar tıklandığında calıssın diye
        tasarim.mainActivityNesnesi = this
        tasarim.textViewSonuc.text = "0"
    }

    fun bottonToplamaTikla(){
        val alinanSayi1 = tasarim.editTextSayi1.text.toString()
        val alinanSayi2 = tasarim.editTextSayi2.text.toString()

        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()

        val toplam = sayi1 + sayi2

        tasarim.textViewSonuc.text = toplam.toString()
    }

    fun buttonCarpmaTikla(){
        val alinanSayi1 = tasarim.editTextSayi1.text.toString()
        val alinanSayi2 = tasarim.editTextSayi2.text.toString()

        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()

        val çarpimi = sayi1 * sayi2

        tasarim.textViewSonuc.text = çarpimi.toString()
    }

}