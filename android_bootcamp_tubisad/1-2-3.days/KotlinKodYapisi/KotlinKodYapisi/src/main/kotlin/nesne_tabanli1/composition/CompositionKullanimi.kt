package nesne_tabanli1.composition

fun main() {
    val k1 = Kategoriler(1, "Bilim Kurgu")
    val k2 = Kategoriler(2, "Fantastik")

    val y1 = Yonetmenler(1, "W.H Hugo")
    val y2 = Yonetmenler(2, "Cristophen Nolan")

    val f1 = Filmler(1,"Yıldızlar Arası",2019,k1,y2)
    val f2 = Filmler(2,"İşler Güçler", 2012, k2,y1)

    getFilmInfo(f1)
    getFilmInfo(f2)

}

fun getFilmInfo(film:Filmler){
    println("ID:                ${film.film_id}")
    println("Ad:                ${film.film_ad}")
    println("Yıl:               ${film.film_yil}")
    println("Kategori:          ${film.kategori.kategori_ad}")
    println("Yonetmen:          ${film.yonetmen.yonetmen_ad}")
    println("----------------------------------------------")
}