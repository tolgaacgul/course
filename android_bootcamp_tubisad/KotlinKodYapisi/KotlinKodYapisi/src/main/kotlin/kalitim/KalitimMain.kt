package com.unispry.kotlindersi.kalitim

fun main() {
    val topkapi = Saray(320.34, 95)
    val bogazKoy = Villa(2, 12)

    println("topkapi.pencereSayisi: ${topkapi.pencereSayisi}")
    println("topkapi.elektrikFaturası: ${topkapi.elektrikFaturası}")

    println("bogazKoy.pencereSayisi: ${bogazKoy.pencereSayisi}")
    println("bogazKoy.havuzSayisi: ${bogazKoy.havuzSayisi}")

    if (bogazKoy is Villa){
        println("bogazKoy Villadır")
    }else{
        println("bogazKoy Villa Değildir")
    }

    // UPCASTING 'dir
    val ev:Ev = topkapi
    println("Upcaasting sonucu: ${ev.pencereSayisi}")

    // DOWNDCASTING
    val saray:Saray = ev as Saray
    println("Upcaasting sonucu: ${saray.pencereSayisi}")
    println("Upcaasting sonucu: ${saray.elektrikFaturası}")


}