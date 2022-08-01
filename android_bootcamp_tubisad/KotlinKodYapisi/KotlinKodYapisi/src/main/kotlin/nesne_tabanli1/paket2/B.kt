package nesne_tabanli1.paket2

import nesne_tabanli1.paket1.A

class B : A() { // Adan kalıtım alıyor.
    fun method(){
        val a = A();
        val liste = ArrayList<String>() // java sınıfımı impor etti //import java.util.ArrayList

        println(a.publicDegisken)
        println(a.varsayilanDegisken)
        println(protectedDegisken) // A daki değikene kalıtım ile eriştik
        // private olana erişim yok
        println()
    }
}


// Visibilty veya Access Modifier