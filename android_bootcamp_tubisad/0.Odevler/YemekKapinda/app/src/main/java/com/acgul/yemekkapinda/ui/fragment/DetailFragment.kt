package com.acgul.yemekkapinda.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.acgul.yemekkapinda.R
import com.acgul.yemekkapinda.databinding.FragmentDetailBinding
import com.google.android.material.snackbar.Snackbar

class DetailFragment : Fragment() {
    private lateinit var vw : FragmentDetailBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        vw = FragmentDetailBinding.inflate(inflater, container, false)
        vw.detailFragment = this

        // Gelen ürünün(data) detay bilgiler
        val bundle: DetailFragmentArgs by navArgs()
        val productDetail = bundle.product
        vw.productObj = productDetail


        vw.imageView.setImageResource(/*requireContext().*/resources.getIdentifier(productDetail.image,"drawable",requireContext().packageName))
        return vw.root
    }

    fun fncPositive(count: String){
        var count = count.toInt()
        count += 1
        vw.textViewCount.text = count.toString()
    }
    fun fncNegative(count: String){
        var count = count.toInt()
        if(count == 0){
            Snackbar.make(vw.buttonNegative,"Sipariş adediniz 0 veya 0'dan büyük olmalı !", Snackbar.LENGTH_SHORT).show()
        }else if(count > 0){
            count -= 1
            vw.textViewCount.setText(count.toString())
        }
    }
    fun fncAddToBasket(name:String, count:String){
        Snackbar.make(vw.buttonBasket,"${name} 'den $count adet sepete eklendi", Snackbar.LENGTH_SHORT).show()
    }

}