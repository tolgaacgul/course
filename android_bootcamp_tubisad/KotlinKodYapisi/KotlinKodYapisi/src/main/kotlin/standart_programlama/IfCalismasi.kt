package standart_programlama

fun main() {
    val yas = 17
    val isim = "Mehmet"

    if(yas >= 18){
        println("Reşitsiniz")
    }else{
        println("Reşit değilsiniz")
    }

    if(isim == "Ahmet"){
        println("merhaba $isim")
    }else if(isim == "Mehmet"){
        println("merhaba $isim")
    }else{
        println("Tanınmayan Kişi")
    }

    val ka = "admin"
    val s = 1234

    if(ka == "admin" && s == 12345){
        println("Hoşgeldiniz")
    }else{
        println("Hatalı giriş yaptınız.")
    }

    val sayi = 10

    if(sayi == 10 || sayi == 20){
        println("Sayı 10 veya 20")
    }else{
        println("Sayi 10 veya 20 değildir.")
    }


    // WHEN = SWİTCH

    val gun = 9

    when(gun){
        1 -> println("pazartesi")
        2 -> println("salı")
        3 -> println("Çarşamba")
        4 -> println("perşembe")
        5 -> println("cuma")
        6 -> println("cumartesi")
        7 -> println("pazar")
        8,9,10 -> println("8,9,10 sayılarına basmış olabilirsin")
        else -> println("gün değeri yanlış")
    }





}