package nesne_tabanli1

/*class Araba { // bu işlem bize hata verir
    var renk
    var hiz
    var calisiyorMu
}*/

// data belirteci getter ve setter ları oluşturur otomatik arka planda
data class Araba(var name:String, var renk:String = "Varsayılan kırmız", var hiz:Int, var calisiyorMu:Boolean) {

    init { // constructor yapısıdır. kısaltmanın anlamı initializ
        println("$name NESNEsi OLUŞTURULDU")
    }

    fun bilgiAl(){
        println("--------------------")
        println("Araç: $name")
        println("Renk: ${renk}")
        println("Hız: ${this.hiz}")
        println("Çalışıyor mu: ${this.calisiyorMu}")
        println("---- ----------------")
    }

    fun calistir(){ // SİDE EFFECT (Yan ETKİ) - sınıfın ozelliklerini değiştiriyor diye
        hiz = 5
        calisiyorMu = true
        bilgiAl()
    }

    fun durdur(){
        hiz = 0
        calisiyorMu = false
        println("* Hızlan *")
        bilgiAl()
    }

    fun hizlan(kacKm:Int){
        hiz += kacKm
        println("* Hızlan *")
        bilgiAl()
    }

    fun yavaşla(kacKm:Int){
        hiz -= kacKm
        println("* Yavaşla *")
        bilgiAl()
    }
}