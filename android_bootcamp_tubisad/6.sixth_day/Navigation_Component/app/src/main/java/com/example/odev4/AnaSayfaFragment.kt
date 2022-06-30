package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.AnasayfaFragmentBinding

class AnaSayfaFragment : Fragment() {
    private lateinit var tasarim:AnasayfaFragmentBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        tasarim = AnasayfaFragmentBinding.inflate(inflater, container, false)

        tasarim.btnToA.setOnClickListener {
            val kisi = Kisiler("TolgaAcgul", 34,1.98F, true)
            val gecis = AnaSayfaFragmentDirections.goHomeToA(ad ="Tolga",yas = 29,boy = 1.74F,evliMi = true, nesne = kisi)

            // bilgi ekranı
            //Snackbar.make(it, "Merhaba TOGA", Snackbar.LENGTH_SHORT).show()
            Navigation.findNavController(it).navigate(gecis)
        }

        tasarim.btnToX.setOnClickListener {
            Navigation.findNavController(tasarim.btnToX).navigate(R.id.GoHomeToX);
        }



        return tasarim.root
    }
}