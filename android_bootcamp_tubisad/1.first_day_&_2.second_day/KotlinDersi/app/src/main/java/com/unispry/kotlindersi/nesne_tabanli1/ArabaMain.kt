package com.unispry.kotlindersi.nesne_tabanli1

fun main() {
    // Nesne oluşturma (Object)
    println("----- BMW -------")
    val yas = 10
    val bmw = Araba("BMW","kırmızı", 200, true)
    // Okuma işlemi
    println("bmw Renk ${bmw.renk}")
    println("bmw Hız ${bmw.hiz}")
    println("bmw Çalışıyor mu ${bmw.calisiyorMu}")
    // Veri atama
    println("--Atamadan sonra--")
    bmw.renk = "Siyah"
    println("bmw Renk ${bmw.renk}")



    println("----- SAHİN -------")
    val sahin = Araba("Şahin","beyaz", 100, true)
    //Oku
    println("sahin Renk ${sahin.renk}")
    println("sahin Hız ${sahin.hiz}")
    println("sahin Çalışıyor mu ${sahin.calisiyorMu}")

    println("---------------- FONKsiyonddan gelen bilgile -----------------")



    bmw.durdur()
    bmw.calistir()
    bmw.yavaşla(30)
    bmw.hizlan(290)




}