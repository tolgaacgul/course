fun main(args: Array<String>) {

    println("----------------WHEN----------------")
    // WHEN Java daki --SWİTCH CASE-- yapısı gibi çalışır
    val numbers:IntArray = intArrayOf(11,12,13,14,15,16)  // Int dizi oluşturma
    val x = 11
    when (x) {
        1 -> print("x == 1")

        2 ->
        {
            print("x == 2")
        }

        3, 4 , 5 -> print("x == 3 veya x == 4 veya x == 5")

        in 6..10 -> print("x 6 ile 10 aralığında")

        in numbers -> println("x NUMBERS dizideki elemana eşit")

        else -> { // Note the block
            print("x hiçbirine eşit değil")
        }
    }

    // FOR döngüsü
    println("----------------FOR----------------")
    var sayilar = listOf(1,2,3,4)
    for(sayi in sayilar) println("sayi: $sayi")

    for((index,value) in sayilar.withIndex()){
        println("${index+1} nolu sayi: $value")
    }

    for(a in 1..10){
        println("Klasik for yapısı: $a")
    }

    val diziA = arrayOf("Tolga","Açgül", "Burada Kalıyor")
    for (n in diziA.indices){
        println("indis: $n 'nin değeri ${diziA[n]}")
    }

    //WHILE ve DO WHILE döngüsü
    println("----------------WHILE----------------")
    var nm:Int = 2
    while (nm < 7){
        println("while dongu: $nm")
        nm++
    }

    do{
        println("do While: $nm")
    }while(nm<2)

}