package com.example.kisileruygulamasi.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.kisileruygulamasi.R
import com.example.kisileruygulamasi.data.entity.Kisiler
import com.example.kisileruygulamasi.databinding.FragmentAnasayfaBinding
import com.google.android.material.snackbar.Snackbar

class AnasayfaFragment : Fragment() {
    private lateinit var vw:FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {

        vw = FragmentAnasayfaBinding.inflate(inflater, container, false)

        vw.toolbarAnasayfa.title = "Kişiler"

        vw.fab.setOnClickListener{
            //Snackbar.make(it,"Merhaba",Snackbar.LENGTH_SHORT).show()
            Navigation.findNavController(it).navigate(R.id.kisiKayitGecis)
        }

        vw.buttonDetay.setOnClickListener{
            val kisi = Kisiler(1,"Ahmet","5388286352")
            val gecis = AnasayfaFragmentDirections.kisiDetayGecis(kisi = kisi)
        }

        return vw.root
    }

}