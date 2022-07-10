package com.unispry.kotlindersi.collection

fun main() {
    val u1 = Urunler(1,"bBilgisayar", 980.99)
    val u2 = Urunler(2,"cKulaklık", 11.99)
    val u3 = Urunler(3,"aTelefon", 200.99)


    val urunListesi = ArrayList<Urunler>()

    urunListesi.add(u1)
    urunListesi.add(u2)
    urunListesi.add(u3)

    for (urun in urunListesi){
        println("ID ${urun.id}: ${urun.ad} -> ${urun.fiyat}₺")
    }

    // Sayısal Sıralam işlemleri
    println("Sayısal: Küçükten - Büyüğe")
    // val siralama1 = urunListesi.sortedWith(compareBy {it.fiyat}) // bunu yada aş. kullanilablir.
    val siralama1 = urunListesi.sortedWith(compareBy {x -> x.fiyat})    //ASC
    for (urun in siralama1){
        println("ID ${urun.id}: ${urun.ad} -> ${urun.fiyat}₺")
    }

    // Sayısal Sıralam işlemleri
    println("Sayısal: Büyükten - Küçüğe")
    val siralama2 = urunListesi.sortedWith(compareByDescending {it.fiyat})  // DESC -> veritabanındaki gibi
    for (urun in siralama2){
        println("ID ${urun.id}: ${urun.ad} -> ${urun.fiyat}₺")
    }


    // Harfsel Sıralam işlemleri
    println("Harfsel: Küçükten - Büyüğe")
    val siralama3 = urunListesi.sortedWith(compareBy {it.ad})
    for (urun in siralama3){
        println("ID ${urun.id}: ${urun.ad} -> ${urun.fiyat}₺")
    }



    // Sıralam işlemleri
    println("Harfsel: Büyükten - Küçüğe")
    val siralama4 = urunListesi.sortedWith(compareByDescending {it.ad})
    for (urun in siralama4){
        println("ID ${urun.id}: ${urun.ad} -> ${urun.fiyat}₺")
    }






    // Filtreleme
    println("Filtreleme 1")
    val filtreleme1 = urunListesi.filter{it.fiyat > 100}
    for (urun in filtreleme1){
        println("ID ${urun.id}: ${urun.ad} -> ${urun.fiyat}₺")
    }

    println("Filtreleme 2")
    val filtreleme2 = urunListesi.filter{it.ad.contains("la")}
    for (urun in filtreleme2){
        println("ID ${urun.id}: ${urun.ad} -> ${urun.fiyat}₺")
    }


}