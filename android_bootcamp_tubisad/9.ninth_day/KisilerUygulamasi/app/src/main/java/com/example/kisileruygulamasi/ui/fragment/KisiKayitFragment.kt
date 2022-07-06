package com.example.kisileruygulamasi.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kisileruygulamasi.R
import com.example.kisileruygulamasi.databinding.FragmentKisiKayitBinding


class KisiKayitFragment : Fragment() {
    private lateinit var vw:FragmentKisiKayitBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        vw = FragmentKisiKayitBinding.inflate(inflater, container, false)

        vw.toolbarKisiKayit.title = "Kişi Kayıt"

        vw.buttonKaydet.setOnClickListener {
            val kisi_ad = vw.editTextKisiAd.text.toString();
            val kisi_tel = vw.editTextKisiTel.text.toString()

            kayit(kisi_ad,kisi_tel)
        }


        return vw.root
    }

    fun kayit(kisi_ad:String, kisi_tel:String){
        Log.e("Kişi Kayıt", "$kisi_ad-$kisi_tel")
    }


}