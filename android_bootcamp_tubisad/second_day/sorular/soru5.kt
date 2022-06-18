package com.example.odev2.sorular

fun main() {
    var kenarSayisi = 4
    var sonuc = icAciToplam(kenarSayisi)
    println(sonuc);
}

fun icAciToplam(kenarSayisi:Int):Int{
    return (kenarSayisi-2) * 180;
}