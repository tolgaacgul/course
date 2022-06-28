package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.AFragmentBinding

class AFragment : Fragment() {
    private lateinit var tasarim:AFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        tasarim = AFragmentBinding.inflate(inflater, container, false)

        tasarim.btnAToB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.GoAToB)
        }


        return tasarim.root
    }
}