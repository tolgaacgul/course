package com.unispry.kotlindersi.nesne_tabanli1

fun main() {
    //Nullable = null safety = (swift) optional
    //null = nil (Swift)

    var str1 = "Merhaba"

    // nul olarak tanımlamak istiyorsak ? kullanılır. bu null olabileceğini soyler
    var str2: String? = null

    //Kullanım

    // yöntem 1: Null olabileceğini sisteme belirtir. ve çıktıyı null olarak verir
    println("Sonuç1: ${str2?.trim()}") // NULL - trim() white space boşlukları siler
    str2 = "merhaba"
    println("Sonuç1: ${str2?.trim()}") // merhaba - trim() white space boşlukları siler

    //yöntem 2: Null olmayacağını iddia edildiğinde(non-null asserted)
    println("Sonuç2: ${str2!!.trim()}")
    str2 = null
    // println("Sonuç2: ${str2!!.trim()}") // null olduğundan sistem çoker

    //yöntem 3:
    if (str2 != null) {
        println("Sonuç3: ${str2.trim()}")
    }else{
        println("Sonuc3: NULL'dur")
        println("Sonuc3: ${str2}")
        //println("str3: ${str2!!}")  // bu bize hata verecektir.
    }

    str2 = "Ahmet"
    // yöntem 4 - Null değilse çalışır
    str2?.let { println("Sonuç4: ?.let ile kontrol yapısı: ${str2.trim()}") }


    // MainActivity kısmına bak ?????????????????????????


}