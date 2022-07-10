package com.unispry.kotlindersi.override_kullanimi

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()

    hayvan.ses() // kendi metodu
    memeli.ses() // kendinde yok kalıtım ile üst sınıftan kalıtım ile erişir
    kedi.ses() // kendi sınıfından override metoda erişim yapmış
    kopek.ses() // kendi sınıfından override metoda erişim yapmış
}