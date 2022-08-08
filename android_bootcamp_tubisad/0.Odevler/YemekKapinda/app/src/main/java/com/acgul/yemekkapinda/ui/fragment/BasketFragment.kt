package com.acgul.yemekkapinda.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.acgul.yemekkapinda.R
import com.acgul.yemekkapinda.databinding.FragmentBasketBinding

class BasketFragment : Fragment() {

    private lateinit var vw:FragmentBasketBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        vw = FragmentBasketBinding.inflate(inflater, container, false)

        vw.toolbarBasket.title = "Sepet"



        return vw.root
    }

}