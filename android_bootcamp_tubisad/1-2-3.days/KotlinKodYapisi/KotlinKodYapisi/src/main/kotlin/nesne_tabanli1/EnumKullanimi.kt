package nesne_tabanli1

// enum sınıfını kullanıyoruz
fun main() {
    ucretHesapla(2,KonserveBoyut.BUYUK)
}

fun ucretHesapla(adet:Int, boyut:KonserveBoyut){
    when(boyut){
        KonserveBoyut.KUCUK -> println("Küçük Konserve: ${adet * 30}₺")
        KonserveBoyut.ORTA -> println("Orta Konserve: ${adet * 40}₺")
        KonserveBoyut.BUYUK -> println("Buyuk Konserve: ${adet * 50}₺")
    }
}