package nesne_tabanli1.paket1

open class A { // open kalıtım yapmaya açık(özellik aktarmaya)...

    var varsayilanDegisken = 1
    public var publicDegisken= 2 // üteki dahil pulic heryerden erişilir
    protected var protectedDegisken = 3 // Katlıtım olursa erişim var
    private var privateDegisken = 4 // sadecesınıf içinde erişim var

    fun getPrivate(){
        println(privateDegisken)
    }
}