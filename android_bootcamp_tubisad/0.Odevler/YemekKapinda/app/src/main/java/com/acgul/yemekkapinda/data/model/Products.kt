package com.acgul.yemekkapinda.data.model

import java.io.Serializable

data class Products(val id:Int, val name:String, val count:Int, val image:String) : Serializable {
}