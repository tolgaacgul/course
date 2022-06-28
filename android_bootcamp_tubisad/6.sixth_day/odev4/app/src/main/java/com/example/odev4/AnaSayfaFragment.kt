package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.AnasayfaFragmentBinding
import com.google.android.material.snackbar.Snackbar

class AnaSayfaFragment : Fragment() {
    private lateinit var tasarim:AnasayfaFragmentBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        tasarim = AnasayfaFragmentBinding.inflate(inflater, container, false)

        tasarim.btnToA.setOnClickListener {
            // bilgi ekranı
            //Snackbar.make(it, "Merhaba TOGA", Snackbar.LENGTH_SHORT).show()
            Navigation.findNavController(tasarim.btnToA).navigate(R.id.GoHomeToA)
        }

        tasarim.btnToX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.GoHomeToX);
        }



        return tasarim.root
    }
}