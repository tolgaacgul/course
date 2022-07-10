package com.unispry.kotlindersi.interface_kullanimi

class ClassA:MyInterface {
    override val degisken: Int = 10

    override fun method() {
        println("Method1 çalıştı")
    }

    override fun metod2(): String {
        return "method2 çallıştı"
    }
}