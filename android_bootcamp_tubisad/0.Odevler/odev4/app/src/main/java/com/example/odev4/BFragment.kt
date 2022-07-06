package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.BFragmentBinding

class BFragment : Fragment() {
    private lateinit var tasarim:BFragmentBinding;
    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = BFragmentBinding.inflate(inflater, container, false)

        tasarim.btnBToY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.GoBToY)
        }


        return tasarim.root
    }
}