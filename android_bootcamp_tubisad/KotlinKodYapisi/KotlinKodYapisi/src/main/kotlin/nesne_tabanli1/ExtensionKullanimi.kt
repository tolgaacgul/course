package nesne_tabanli1

fun main() {
    //Extension // genişletme- eklenti anlamına gelir(Bir sınıfa ek bişeler eklemek için)

    val sonuc = 5.carp(2)
    val sonuc1 = 5 carpi 4  // infix kullanarak bu sekilde kullanılır
    println("Gelen sonuc: $sonuc")
    println("Gelen sonuc: $sonuc1")
}

fun Int.carp (sayi:Int): Int{
    return sayi * this // this int sınıfını temsil eder
}

infix fun Int.carpi (sayi:Int): Int{
    return sayi * this
}
// this = self