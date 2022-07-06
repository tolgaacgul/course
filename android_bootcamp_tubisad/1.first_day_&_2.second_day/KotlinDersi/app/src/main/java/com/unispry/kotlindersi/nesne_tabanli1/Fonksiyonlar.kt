package com.unispry.kotlindersi.nesne_tabanli1

class Fonksiyonlar {

    // Void - yapısına sahip
    fun selamla(){
        val sonuc  = "Merhaba Dunyalı"
        println(sonuc)
    }


    // RETURN - donus turune sahip turler
    fun selamla2(): String{ // string turunde donus olacağını belirttik
        val sonuc = "Mehmet Ahmet"
        return sonuc
    }

    // PARAMETRELİ
    fun selamla3(isim:String){
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    // PARAMETRELİ ve return lü
    fun toplama(sayi1:Int, sayi2:Int): Int{
        val toplam = sayi1 + sayi2
        return toplam
    }

    // Overloading
    fun carpma(sayi1: Int, sayi2: Int){
        println("Çarpma: ${sayi2*sayi1}")
    }
    fun carpma(sayi1: Int, sayi2: Double){
        println("Çarpma: ${sayi2*sayi1}")
    }
    fun carpma(sayi1: Int, sayi2: Int, isim:String){
        println("Çarpma: ${sayi2*sayi1} - İşlem: $isim")
    }


}