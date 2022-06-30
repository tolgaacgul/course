fun main(){

    // length
    val str:String = "tOlGa"
    val sifre:String = "Tolga123"
    val cumle:String = "Uzunca bir cumle"

    println("$str Uzunluğu :  ${str.length}")
    println("Şifre eşitmi:  ${sifre.equals("tolga123")}")
    println("Şifre eşitmi:  ${sifre.equals("Tolga123")}")
    val i:Int = 4
    println("$i 'nıncı Karakter Değeri: ${str.get(i)}")
    println("$i 'nıncı Karakter Değeri: ${str[i]}")

    //string değerin sonuna değer eklemek için kullanılır
    println("$str değerinin sonuna eklendi: ${str.plus(" Açgül")}")
    println("str değerinin son hali: $str")

    //subSequence kullanımı(son değer dahil değil)
    println("cumle 'nin Belli aralığını alır: ${cumle.subSequence(2,4)}")

    //capitalize sadece şlk harf buyuk
    println("$str 'nin ilk haf buyuk yapr: ${str.capitalize()}")

    // contains kelime içinde arama yaparak t f değer döndürür.(k,b harf duyarlı)
    println("$str 'de lG varmi: ${str.contains("lG")}")
    println("$str 'de sl varmi: ${str.contains("sl")}")

    //1.55 dk

}
