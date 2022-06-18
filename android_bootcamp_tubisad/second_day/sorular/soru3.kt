package com.example.odev2.sorular

fun main() {
    println(faktoriyel(5))
}

fun faktoriyel(i:Int):Int{
    var fak : Int = 1;
    var toI = 1..i
    for (a in toI){
        fak = fak * a;
    }
    return fak;
}