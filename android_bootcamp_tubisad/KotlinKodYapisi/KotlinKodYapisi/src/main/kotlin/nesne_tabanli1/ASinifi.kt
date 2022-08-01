package nesne_tabanli1

// Static sınıf kullanımını öğrenebilmek için oluşturuldu
// StaticKulalanimi.kt

class ASinifi {
    var x = 10;
    fun method(){
        println("ASinifi->method() method çalıştı")
    }

    companion object{ // companion=
        var y = "Static noktası"
        fun method2(){
            println("static function çalıştı")
        }
    }
}