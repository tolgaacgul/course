fun main() {
    var isim:String = getName("Tolga");
    println("isim: $isim")

    selamla()

    // ******LAMBDA yapsında fonksiyon yapısı
    println("------Lamda yapısında fonksiyon ------")
    val kursadiniYazdir:(String)->Unit = {s:String -> println(s) }
    val ad:String = "ISMEK ANDROID PROGRAMLAMA"
    kursadiniYazdir(ad)

}

// return tipinde bir fonksiyon
fun getName(name:String):String{
    var sonuc:String = "Merhaba " + name
    return sonuc
}

// void turunde bir fonksiyon
fun selamla(){
    println("Selamlama")
}