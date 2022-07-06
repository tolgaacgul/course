package com.unispry.detaylirecycler

import java.io.Serializable

data class Filmler(var filmId:Int,
                   var filmAdi:String,
                   var filmResimAdi:String,
                   var filmYil:Int,
                   var filmFiyat:Double,
                   var filmYonetmen:String) : Serializable {




}