package com.example.odev2.sorular

fun main() {
    var derece : Double = 28.3
    var sonuc : Double = toFahrenhiet(derece);
    println(sonuc)
}

fun toFahrenhiet(derece : Double) : Double{
    var sonuc : Double
    sonuc = derece * 1.8 + 32;
    return sonuc;
}