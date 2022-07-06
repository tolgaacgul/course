package com.example.odev4

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.odev4.databinding.AFragmentBinding

class AFragment : Fragment() {
    private lateinit var tasarim:AFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        tasarim = AFragmentBinding.inflate(inflater, container, false)

        val bundle:AFragmentArgs by navArgs() // by keimesi Delegate anlamına gelir

        val gelenAd = bundle.ad;
        val gelenYas = bundle.yas
        val gelenBoy = bundle.boy
        val gelenEvlimi = bundle.evliMi

        Log.e("gelen Ad: ", gelenAd)
        Log.e("gelen Yas: ", gelenYas.toString())
        Log.e("gelen Boy: ", gelenBoy.toString())
        Log.e("gelen Evlimi: ", gelenEvlimi.toString())


        // gelen nesne yapımız
        val nesnem = bundle.nesne

        Log.e("gelen Nesne Ad: ", nesnem.ad)
        Log.e("gelen Nesne Yas: ", nesnem.yas.toString())
        Log.e("gelen Nesne Boy: ", nesnem.boy.toString())
        Log.e("gelen Nesne Evlimi: ", nesnem.evliMi.toString())


        tasarim.txtInfo.setText(nesnem.ad)

        tasarim.btnAToB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.GoAToB)
        }


        return tasarim.root
    }
}