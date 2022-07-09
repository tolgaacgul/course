package nesne_tabanli1

fun main() {
    // 1.yöntem: Standart nesne erişimi
    println("--1.yöntem:  Standart nesne erişimi")
    val a = ASinifi()
    println(a.x)
    a.method()

    // 2.yöntem: Sanal nesne oluşturma
    println("--2.yöntem: Sanal nesne oluşturma")
    println(ASinifi().x)
    ASinifi().method()
    // dezavantajı her cağırıldığında nesne oluşturması. bir müddet sonra hazı yonetimini kötü etkiler
    // static yontem ile karışmasın. () ifadesi sanal bir nesne oluşturur.

    // 3.Yöntem: Static
    println("--3.yöntem: Static yöntem")
    println(ASinifi.y)
    ASinifi.method2()
}