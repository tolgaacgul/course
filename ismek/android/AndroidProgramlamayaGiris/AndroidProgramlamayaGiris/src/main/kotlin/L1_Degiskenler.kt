fun main(args: Array<String>) {
    val yas:Int = 27
    val boy:Double = 1.70
    val kilo:Float = 75.3F
    val toplamDk:Long = 1231239
    val s:Short = 12
    val b:Byte = 5;
    val karakter:Char = 'A'
    var durum:Boolean = true
    var cumle:String = "String değişkekni bir çok karakterden oluşur."
    var dizi = arrayOf(1,2,3,4)

    println("Yaş değeri: " + yas)
    println("boy değeri: " + boy)
    println("kilo değeri: " + kilo)
    println("toplamDk değeri: " + toplamDk)
    println("s değeri: " + s)
    println("b değeri(str içine): ${b}")
    println("karakter değeri: $karakter")
    println("durum değeri: $durum")
    for (eleman in dizi){
        println("Dizi Geğeri $eleman")
    }

}