package com.acgul.navigationcomponent

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.acgul.navigationcomponent.databinding.FragmentOyunEkraniBinding
import com.google.android.material.snackbar.Snackbar

class OyunEkraniFragment : Fragment() {
    private lateinit var tasarim : FragmentOyunEkraniBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        tasarim = FragmentOyunEkraniBinding.inflate(inflater, container, false)


        val bundle:OyunEkraniFragmentArgs by navArgs()

        val ad = bundle.isim
        val kisi = bundle.nesneKisiler
        // Log.e("Gelen Ad", ad)
        tasarim.textView2.setText(ad)

        tasarim.textViewAd.setText(kisi.ad)
        tasarim.textViewYas.setText(kisi.yas.toString())
        tasarim.textViewBoy.setText(kisi.boy.toString())

        tasarim.buttonBitir.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_oyunEkraniFragment_to_sonucEkraniFragment3)
        }

        return tasarim.root
    }
}