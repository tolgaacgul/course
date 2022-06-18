package com.example.odev2.sorular

fun main() {
    var kacKotaHarcadin = 56;
    var sonuc = kotaUcretlendirme(kacKotaHarcadin);
    println("${kacKotaHarcadin}GB internet ${sonuc}₺ ")
}

fun kotaUcretlendirme(kota : Int):Double{
    // 50GB kadar sabit fiyatlandırma yapıldı
    var fiyat:Double = 0.0;
    var sabitUcret : Double = 100.0
    val anaKota = 50
    if(kota <= anaKota){
        fiyat = sabitUcret;
    }else if(kota > anaKota){
        var fazlaKota = kota - anaKota;
        fiyat = sabitUcret + fazlaKota * 4;
    }
    return fiyat;
}