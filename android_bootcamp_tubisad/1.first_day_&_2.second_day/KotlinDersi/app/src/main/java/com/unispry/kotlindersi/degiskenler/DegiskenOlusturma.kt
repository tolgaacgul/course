package com.unispry.kotlindersi.degiskenler

fun main() {
    var ogrenciAdi = "Ahmet"
    var ogrenciYas = 29
    var ogrenciBoy = 1.54
    var ogrenciBasHarf = 'A'
    var ogrenciDevamMi = true

    println(ogrenciAdi)
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasHarf)
    println(ogrenciDevamMi)


    println("----------Veri tabanı modulu sorgusu---------")
    var urun_id:Int = 314485;
    var urun_adi:String = "MacBook PRO"
    var urun_adet:Int = 100
    var urun_fiyat:Double = 23.444
    var urun_tedarikci:String = "Apple Distributing"

    println("Ürün ID: $urun_id")
    println("Ürün Adi: $urun_adi")
    println("Ürün adet: $urun_adet")
    println("Ürün Fiyat: $urun_fiyat ₺")
    println("Ürün tedarikci: $urun_tedarikci")

    // + ile de değişkenleri tanımlayabiliriz stringde
    println("ürün adi (+) ile: " + urun_adi)

    val a = 10
    val b = 20
    println("$a x $b = $a*b")
    println("$a x $b = ${a*b}")


    // Sabit değerimiz val - aşg. gibi diğer dillerdeki isimler gibi görev görür
    // Constant - Sabitler : val = let = final = const

    var sayi = 30
    println("sayi $sayi")
    sayi = 20
    println("sayi $sayi")

    val numara = 90
    println("numara $numara")

    // mümkün olduğu kadar val kullanmak gerekir. çünkü başından boyutu ona gore oluşturur.


}