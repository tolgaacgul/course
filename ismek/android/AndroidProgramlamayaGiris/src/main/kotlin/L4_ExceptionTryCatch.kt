fun main(args: Array<String>) {


    try {
        var kelime:String = "Merhaba"
        kelime.toInt();
    }catch(e:Exception){
        println("HATA : ${e.message}")
    }finally {
        println("Öyle yada böyle çalışacaak")
    }

    
}