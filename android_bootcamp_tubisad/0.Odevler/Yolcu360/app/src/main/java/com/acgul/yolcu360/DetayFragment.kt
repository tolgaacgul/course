package com.acgul.yolcu360

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.acgul.yolcu360.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {
    private lateinit var tasarim: FragmentDetayBinding
    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        tasarim = FragmentDetayBinding.inflate(inflater, container, false)



        return tasarim.root
    }

}