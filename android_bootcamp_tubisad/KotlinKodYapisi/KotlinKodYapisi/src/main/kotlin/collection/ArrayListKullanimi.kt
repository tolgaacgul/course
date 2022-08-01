package com.unispry.kotlindersi.collection

fun main() {
    //Tanımlama
    val meyveler = ArrayList<String>()

    // veri ekleme işlemleri
    meyveler.add("Elma") //0
    meyveler.add("Muz") //1
    meyveler.add("Armut") //2. index

    println("meyveler: $meyveler")

    // Güncellme
    meyveler[1] = "yeni muz"
    println("meyveler: $meyveler")

    //Insert ozelliği
    meyveler.add(1,"Portalal-insert")
    println("meyveler: $meyveler")

    //Okuma işlemi
    println(meyveler.get(2))
    println(meyveler[3])

    println("Boyut: ${meyveler.size}")
    println("Boş mu: ${meyveler.isEmpty()}")
    println("içeriyor mu: ${meyveler.contains("Armut")}")


    meyveler.reverse()
    println("meyveler: $meyveler")

    meyveler.sort()
    println("meyveler: $meyveler")

    for(meyve in meyveler){
        println("sonuç: $meyve")
    }

    // index değerini de kullnamamıza yarar
    for((index,meyve) in meyveler.withIndex()){
        println("$index. sonuç: $meyve")
    }

    // silme işlemi
    meyveler.removeAt(2)
    println("meyveler: $meyveler")

    //Tamamen temizleme işlemi
    meyveler.clear()
    println("meyveler: $meyveler")




}