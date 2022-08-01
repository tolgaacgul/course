package com.unispry.kotlindersi.ileri_kotlin

fun main() {
    val x = 10
    val y = 0

    try{
        println("X/Y-Sonuç: ${x/y}")
        println("işlem Tamam")
    }catch(e:Exception){
        println("İkinci sayı sıfır olamaz")
    }


}