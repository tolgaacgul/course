package com.example.widgetskullanimi

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.SeekBar
import android.widget.TimePicker
import com.example.widgetskullanimi.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import java.sql.Time
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.btn1.setOnClickListener {
            tasarim.imageView.setImageResource(R.drawable.resim1)
        }
        tasarim.btn2.setOnClickListener {
            tasarim.imageView.setImageResource(R.drawable.resim2)
        }

        tasarim.btnBasla.setOnClickListener {
            tasarim.progressBar.visibility = View.VISIBLE
        }

        tasarim.btnDur.setOnClickListener {
            tasarim.progressBar.visibility = View.INVISIBLE
        }

        tasarim.textViewSonuc.text = tasarim.slider.progress.toString()

        /*
        tasarim.slider.setOnSeekBarChangeListener(Object : SeekBar.OnSeekChangeListener{
            override fun onProgressChanged(p0: SeekBar?, ilerleme: Int, p2:Boolean){
                tasarim.textViewSonuc.text = ilerleme.toString();
            }
        })
         */



        tasarim.buttonSaat.setOnClickListener {
            val calender = Calendar.getInstance()
            val saat = calender.get(Calendar.HOUR_OF_DAY)
            val dakika = calender.get(Calendar.MINUTE)

            val tp = TimePickerDialog(this,TimePickerDialog.OnTimeSetListener{t, s, dk ->
                tasarim.editTextSaat.setText("$s : $dk")
            },saat,dakika,true)

            tp.setButton(DialogInterface.BUTTON_POSITIVE, "Seç", tp)
            tp.setButton(DialogInterface.BUTTON_NEGATIVE, "İptal", tp)
            tp.show()

        }

        tasarim.buttonTarih.setOnClickListener {
            val calender = Calendar.getInstance()
            val yil = calender.get(Calendar.YEAR)
            val ay = calender.get(Calendar.MONTH)
            val gun = calender.get(Calendar.DAY_OF_MONTH)

            val dp = DatePickerDialog(this, DatePickerDialog.OnDateSetListener{d, y, a, g ->
                tasarim.editTextTarih.setText("$g/${a+1}/$y")
            },yil,ay,gun)

            dp.setButton(DialogInterface.BUTTON_POSITIVE, "Seç",dp)
            dp.setButton(DialogInterface.BUTTON_NEGATIVE, "İptal",dp)
            dp.show()
        }


        val ulkeler = ArrayList<String> ()
        ulkeler.add("türkiye")
        ulkeler.add("Norveç")
        ulkeler.add("İtalya")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, ulkeler)

        tasarim.spinner.adapter = adapter
        val position = tasarim.spinner.selectedItemPosition;

        /*
        tasarim.spinner.onItemClickListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View, p2: Int, p3: Long){
                Snackbar.make(p1,"${ulkeler.get(position)} seçildi", Snackbar.LENGTH_SHORT).show()
            }
        }
         */

        tasarim.btnGoster.setOnClickListener {
            Log.e("widgets", "Enson seçilen index:  ${tasarim.spinner.selectedItemPosition}")
           // Log.e("widgets", "Enson seçilen Ülke:  ${ulkeler.get(tasarim.spinner.selectedItemPosition)}")
        }


    }
}










