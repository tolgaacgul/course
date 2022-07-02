package com.example.odev5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.odev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var vw:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vw = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vw.root)

        var total:Long = 0;
        var nowNumberStr:String = ""

        //Eşitleme işlemi
        vw.btnEquals.setOnClickListener {
            if (nowNumberStr.endsWith("+")){
                println("Son değer +")
                nowNumberStr = nowNumberStr.dropLast(1)
            }
            if(!nowNumberStr.equals("")){
                val nums: List<String> = nowNumberStr.split("+")
                for (num in nums){
                    total += num.toLong()
                }
                vw.sonuc.setText(total.toString())
                nowNumberStr = "";
                vw.txtIslem.setText(nowNumberStr)
                total = 0
            }
        }
        // sıfırlama
        vw.btnAC.setOnClickListener {
            vw.sonuc.setText("").toString()
            vw.txtIslem.setText("").toString()
            nowNumberStr = ""
            total = 0
        }
        // silme işlemi
        vw.btnDel.setOnClickListener {
            nowNumberStr = vw.txtIslem.text.toString().dropLast(1)
            vw.txtIslem.setText(nowNumberStr).toString()
        }
        // + ekleme işlemi
        vw.btnPossitive.setOnClickListener {
            if(nowNumberStr != ""){
                nowNumberStr += "+"
                vw.txtIslem.setText("$nowNumberStr").toString()
            }else if(nowNumberStr == ""){
                nowNumberStr = vw.sonuc.text.toString() + "+"
                vw.txtIslem.setText("$nowNumberStr").toString()
            }
        }
        // ------------- Sayı Tuş Takımı ---------------
        vw.btn0.setOnClickListener {
            vw.txtIslem.setText("${vw.txtIslem.text}0").toString()
            nowNumberStr += "0"
        }
        vw.btn1.setOnClickListener {
            vw.txtIslem.setText("${vw.txtIslem.text}1").toString()
            nowNumberStr += "1"
        }
        vw.btn2.setOnClickListener {
            vw.txtIslem.setText("${vw.txtIslem.text}2").toString()
            nowNumberStr += "2"
        }
        vw.btn3.setOnClickListener {
            vw.txtIslem.setText("${vw.txtIslem.text}3").toString()
            nowNumberStr += "3"
        }
        vw.btn4.setOnClickListener {
            vw.txtIslem.setText("${vw.txtIslem.text}4").toString()
            nowNumberStr += "4"
        }
        vw.btn5.setOnClickListener {
            vw.txtIslem.setText("${vw.txtIslem.text}5").toString()
            nowNumberStr += "5"
        }
        vw.btn6.setOnClickListener {
            vw.txtIslem.setText("${vw.txtIslem.text}6").toString()
            nowNumberStr += "6"
        }
        vw.btn7.setOnClickListener {
            vw.txtIslem.setText("${vw.txtIslem.text}7").toString()
            nowNumberStr += "7"
        }
        vw.btn8.setOnClickListener {
            vw.txtIslem.setText("${vw.txtIslem.text}8").toString()
            nowNumberStr += "8"
        }
        vw.btn9.setOnClickListener {
            vw.txtIslem.setText("${vw.txtIslem.text}9").toString()
            nowNumberStr += "9"
        }
    }
}