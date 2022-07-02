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
        var nowNumber:Long = 0;
        var totalStr:String = ""
        var nowNumberStr:String = ""

        vw.btnAC.setOnClickListener {
            vw.sonuc.setText("").toString()
        }
        vw.btn0.setOnClickListener {
            vw.sonuc.setText("${vw.sonuc.text}0").toString()
            nowNumberStr += "0"
        }
        vw.btn1.setOnClickListener {
            vw.sonuc.setText("${vw.sonuc.text}1").toString()
            nowNumberStr += "1"
        }
        vw.btn2.setOnClickListener {
            vw.sonuc.setText("${vw.sonuc.text}2").toString()
            nowNumberStr += "2"
        }
        vw.btn3.setOnClickListener {
            vw.sonuc.setText("${vw.sonuc.text}3").toString()
            nowNumberStr += "3"
        }
        vw.btn4.setOnClickListener {
            vw.sonuc.setText("${vw.sonuc.text}4").toString()
            nowNumberStr += "4"
        }
        vw.btn5.setOnClickListener {
            vw.sonuc.setText("${vw.sonuc.text}5").toString()
            nowNumberStr += "5"
        }
        vw.btn6.setOnClickListener {
            vw.sonuc.setText("${vw.sonuc.text}6").toString()
            nowNumberStr += "6"
        }
        vw.btn7.setOnClickListener {
            vw.sonuc.setText("${vw.sonuc.text}7").toString()
            nowNumberStr += "7"
        }
        vw.btn8.setOnClickListener {
            vw.sonuc.setText("${vw.sonuc.text}8").toString()
            nowNumberStr += "8"
        }
        vw.btn9.setOnClickListener {
            vw.sonuc.setText("${vw.sonuc.text}9").toString()
            nowNumberStr += "9"
        }
        vw.btnPossitive.setOnClickListener {
            println("nowNumberStr:  $nowNumberStr")

        }
        vw.btnEquals.setOnClickListener {

        }

    }
}