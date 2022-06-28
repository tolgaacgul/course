package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.XFragmentBinding

class XFragment : Fragment() {
    private lateinit var tasarim:XFragmentBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        tasarim = XFragmentBinding.inflate(inflater, container, false)

        tasarim.btnXToY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.GoXToY)
        }

        return tasarim.root
    }
}