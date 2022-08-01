package com.unispry.kotlindersi



class MainActivity{

    //burada nullable oluşturmak farklılaşabilir
    var str1:String? = null // normal yapı. bu sekil nullable olabileceği belirtildi
    lateinit var str2:String //late init - daha sonra başlatacağını söyler
    // NOT :lateinit ifadesinden sonra sade "var" kullanılabilir
    // çünkü değer değiştirelecek olduğundan val ifadesi kullanılmaz. val değiştirilmeyecek ifadeler de kullanılır.

    // lateinit var sayi:Int  //Int,Boolean,Double,Float vb gibi primitive ifadeler de lateinit kullanılamaz
    var sayi:Int = 0

    /*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        str2 = "Merhaba ben daha sonra başlatıldım."
    }
    */
}