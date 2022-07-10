package com.unispry.kotlindersi.collection

fun main() {

    val iller = HashMap<Int, String>() // Swift-> Dictionary

    iller.put(1,"Adana")
    iller.put(52,"Ordu")
    iller.put(34,"Istanbul")
    iller[6] = "Ankara"

    println("iller: $iller")

    println("iller.get(34): ${iller.get(34)}")

    iller.put(52, "Fatsa") // aynı zamanda güncelleme yapar.
    println(iller)

    println("iller.size: ${iller.size}")
    println("iller.isEmpty(): ${iller.isEmpty()}")

    for((anahtar,deger) in iller){
        println("$anahtar ----> $deger")
    }

    println("---Silme İşlemi")
    iller.remove(34)
    println(iller)


    println("---Temizleme işlemi")
    iller.clear()
    println(iller)

}