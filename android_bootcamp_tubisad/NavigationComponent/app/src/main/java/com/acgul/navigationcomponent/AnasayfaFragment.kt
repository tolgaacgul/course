package com.acgul.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.acgul.navigationcomponent.databinding.FragmentAnasayfaBinding
import com.acgul.navigationcomponent.model.Kisiler
import com.google.android.material.snackbar.Snackbar

class AnasayfaFragment : Fragment() {
    private lateinit var tasarim : FragmentAnasayfaBinding

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        // inflate tasarımı yazılıma aktarmak için kullanılan bir yapı
        // container (viewGroup gurubundan) yazılımsal tasarım olarak adlandırbilriz.

        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)

        tasarim.buttonBasla.setOnClickListener {
            var kisi = Kisiler("Tolga", 27, 1.74f, false)
            val gecis = AnasayfaFragmentDirections.actionAnasayfaFragmentToOyunEkraniFragment(isim = "Tolga", nesneKisiler = kisi)

            Navigation.findNavController(it).navigate(gecis)
        }


        return tasarim.root
    }
}