package com.acgul.navigationcomponent.model

import java.io.Serializable


// NavigationComponent kısmında bunu args olarak alacağız. res->navigation paketine geçelim
data class Kisiler(var ad:String, var yas:Int, var boy:Float, var evliMi:Boolean) : Serializable{
}