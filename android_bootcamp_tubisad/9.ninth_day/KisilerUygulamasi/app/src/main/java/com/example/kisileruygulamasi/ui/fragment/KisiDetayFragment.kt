package com.example.kisileruygulamasi.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kisileruygulamasi.R
import com.example.kisileruygulamasi.databinding.FragmentKisiDetayBinding


class KisiDetayFragment : Fragment() {

    private lateinit var vw:FragmentKisiDetayBinding
    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        vw = FragmentKisiDetayBinding.inflate(inflater, container, false)

        vw.toolbarKisiDetay.title = "Kişi Detay"

        val bundle:KisiDetayFragmentArgs by navArgs()
        val gelenKisi = bundle.kisi

        vw.editTextKisiAd.setText(gelenKisi.kisi_ad)
        vw.editTextKisiTel.setText(gelenKisi.kisi_tel)

        vw.buttonGuncelle.setOnClickListener {
            val kisi_ad = vw.editTextKisiAd.text.toString()
            val kisi_tel = vw.editTextKisiTel.text.toString()

            guncelle(gelenKisi.kisi_id,kisi_ad,kisi_tel)
        }

        return vw.root
    }

    fun guncelle(kisi_id:Int, kisi_ad:String, kisi_tel:String){
        Log.e("Kişi Güncelle", "$kisi_id - $kisi_ad - $kisi_tel")
    }


}