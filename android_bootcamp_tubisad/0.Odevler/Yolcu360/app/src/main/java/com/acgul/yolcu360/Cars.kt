package com.acgul.yolcu360

import java.io.Serializable

data class Cars(var id:Int,  var company_name:String, var image_name:String,
                var brand:String, var daily_price:Double,
                var gear:String, var fuel:String, var vehicle_class:String,
                var seat:Int, var vehicle_delivery_method:String,
                var deposit_fee:Double, var km_limit:Double) : Serializable{ //veri transferi için
}