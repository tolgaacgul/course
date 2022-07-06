package com.unispry.kotlindersi.degiskenler

fun main() {

    // TUR DONUSUMLER

    // toDouble(), toFloat(), toLong(), toInt(), toShort(), toByte(), toChar(), toString()

    val i = 42
    val d = 78.3

    val sonuc1 = i.toDouble()
    println("$i toDouble() $sonuc1")

    val sonuc2 = d.toInt()
    println("$d toInt() $sonuc2")

    // Sayısaldan metine dönüşüm
    val sonuc3 = i.toString() //"42"
    val sonuc4 = d.toString() // "78.3"
    println(sonuc3)
    println(sonuc4)

    // Metinden sayısala donusum

    var yazi = "67.34"
    val sonuc5 = yazi.toDoubleOrNull()
    println("$yazi toDouble $sonuc5")


    yazi = "67.34."
    var sonuc6 = yazi.toDoubleOrNull()
    println("$yazi toDouble $sonuc6 ")

    if(sonuc6 != null){
        println("if'den $sonuc6")
    }else{
        println("Sonuç null dır")
    }

    sonuc6 = null;
    sonuc6?.let{// sonuc6 null değilse çalışır
        // if else yapısına benzer
        println("sonuc6: $sonuc6")
    }

}