package com.example.kullanicietkilesimi

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.example.kullanicietkilesimi.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonToast.setOnClickListener {
            Toast.makeText(this, "Merhaba Tolga", Toast.LENGTH_SHORT).show()
        }

        tasarim.buttonSnackbar.setOnClickListener {
            Snackbar.make(it,"Silmek İstiyor musun?", Snackbar.LENGTH_SHORT)
                .setAction("EVEET"){
                    Snackbar.make(it,"Silindi", Snackbar.LENGTH_SHORT).show()
                }
                .setBackgroundTint(Color.WHITE)
                .setTextColor(Color.BLUE)
                .setActionTextColor(Color.RED)
                .show()
        }

        tasarim.buttonAlert.setOnClickListener {
            /*
            val ad = AlertDialog.Builder(this)
            ad.setTitle("Başlık")
            ad.setMessage("İçerik")
            ad.setIcon(R.drawable.resim)
            ad.setPositiveButton("Tamam"){s,d ->
                Toast.makeText(this, "Tamam Seçildi." , Toast.LENGTH_SHORT).show()
            }

            ad.setNegativeButton("iptal"){s,d ->
                Toast.makeText(this,"İptal Seçildi", Toast.LENGTH_SHORT).show()
            }

            ad.create().show();

            */

            val ad = AlertDialog.Builder(this)
            val alertTasarim = layoutInflater.inflate(R.layout.alert_tasasarim, null)
            val textViewAlert = alertTasarim.findViewById(R.id.textViewAlert) as TextView
            val editTextAlert = alertTasarim.findViewById(R.id.editTextTextAlert) as EditText
            val checkBoxAlert = alertTasarim.findViewById(R.id.checkBoxAlert) as CheckBox
            val buttonKaydet = alertTasarim.findViewById(R.id.buttonKaydet) as Button

            ad.setView(alertTasarim)

            textViewAlert.text = "Yapılacaklar"

            val d = ad.create()

            buttonKaydet.setOnClickListener {
                val yapilacaklar = editTextAlert.text.toString();
                val acilDurum = checkBoxAlert.isChecked
                Toast.makeText(this,"$yapilacaklar - $acilDurum", Toast.LENGTH_SHORT).show();
                d.dismiss()
            }

            ad.create().show()
        }
    }
}