package com.example.odev2.sorular

fun main() {
    var kacGunCalistin = 23.5
    println("Maaşınız: ${maas(kacGunCalistin)}" );
}

fun maas(gun:Double):Double{
    var sonuc = 0.0;
    var totalSaat:Double = gun * 8
    var normalCalismaSaati = 160
    if(totalSaat <= normalCalismaSaati){
        sonuc = totalSaat * 10.0 // normal ücret
    }else if(totalSaat > normalCalismaSaati){
        var mesaiSaatleri = totalSaat - normalCalismaSaati;
        sonuc = (10 * normalCalismaSaati) + (mesaiSaatleri * 20); // + mesaili ücret
    }
    return sonuc;
}