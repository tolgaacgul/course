package com.example.odev2.sorular

fun main() {
    println(dikdorgenCevresi(12,4))
}

fun dikdorgenCevresi(uzun:Int, kisa:Int): Int {
    var sonuc = uzun * 2 + kisa * 2;
    return sonuc
}