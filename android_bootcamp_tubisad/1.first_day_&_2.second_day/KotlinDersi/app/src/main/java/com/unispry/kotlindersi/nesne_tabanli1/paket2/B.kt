package com.unispry.kotlindersi.nesne_tabanli1.paket2

import com.unispry.kotlindersi.nesne_tabanli1.paket1.A //import dediğimiz yapı
import java.util.ArrayList

// kullanmak istediğimiz sınıfmız farklı paketteyse buraya import edilmek zorunda

class B {
    fun method(){
        val a = A()
        val liste = ArrayList<String>() // java sınıfımı impor etti //import java.util.ArrayList
    }
}