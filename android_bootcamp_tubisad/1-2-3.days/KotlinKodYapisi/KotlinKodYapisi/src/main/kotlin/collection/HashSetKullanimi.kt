package com.unispry.kotlindersi.collection

// Hashset in özelliği içeriği karıştırır. belirli düzenli index yapısına gore gitmez


fun main() {
    val meyveler = HashSet<String>()

    meyveler.add("Elma")
    meyveler.add("Kiraz")
    meyveler.add("Muz")
    println(meyveler)

    // aynı içeriği tekrar eklemez
    meyveler.add("Elma")
    println(meyveler)

    meyveler.add("Amasya-Elması")
    println(meyveler)

    // diğer ozellikleri arraylist yapısına oldukça benzer

    // istediğimiz indexti bilgiyi çağırabiliriz.(Java da bu ozellik yok. kotline özel)
    println("meyveler.elementAt(2): ${meyveler.elementAt(2)}")
    println("meyveler.size: ${meyveler.size}")
    println(meyveler.isEmpty())

    for(m in meyveler){
        println("Sonuç: $m")
    }

    for((i,m) in meyveler.withIndex()){
        println("$i -> $m")
    }

    meyveler.remove("Elma")
    println(meyveler)

    meyveler.clear()
    println(meyveler)


}