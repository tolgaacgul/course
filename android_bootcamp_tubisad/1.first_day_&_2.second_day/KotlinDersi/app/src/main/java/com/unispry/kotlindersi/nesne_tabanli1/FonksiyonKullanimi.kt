package com.unispry.kotlindersi.nesne_tabanli1

fun main() {
    val f = Fonksiyonlar()
    f.selamla()

    val gelenSonuc = f.selamla2() //string donen bilgi aktarıldı
    println("Gelen Sonuç: $gelenSonuc")

    f.selamla3("Tolga")

    val gelenToplam = f.toplama(3,1)
    println("Gelen Toplam: $gelenToplam")

    f.carpma(5,4,"ECE")
    f.carpma(3,2.3)
    f.carpma(3,2)
}