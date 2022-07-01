fun main(args: Array<String>) {

    /*
    toChar()
    toInt()
    toLong()
    toFloat()
    toDouble()
    toByte()
    toShort()
     */
    val sayi1:Int = 4
    val sayi2:Long = 234

    val sonuc: Long = sayi2 + sayi1.toLong()

    println("Sonuç: $sonuc")


    println("45.231 dan Int turune: " + (45.231.toInt()))
    println("98 dan Char turune: " + (98.toChar()))
    println("A dan Int turune: " + ('A'.toInt()))
    println("A dan Byte turune: " + ('A'.toByte()))

    // Veri kaybına sebep olacak olan tür dönüşümüne örnek
    // Long ve Int veri türleri farklı boyutlara sahip olduğundan veri kaybına sebep olur.
    // Bundan dolayı bilinçli dnüşüm yapmalı
    var sayiA:Long = 4412989769592;
    var sayiB:Int = sayiA.toInt()

    println("sayiA (Long) değeri: $sayiA")
    println("sayiB (toInt()) değeri: $sayiB")




}