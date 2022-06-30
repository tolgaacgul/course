package com.example.odev4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.odev4.databinding.BottomSayfaBinding
import com.example.odev4.databinding.DrawerSayfaBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim:DrawerSayfaBinding //BottomSayfaBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        tasarim = DrawerSayfaBinding.inflate(layoutInflater)
        setContentView(tasarim.root)
        //setContentView(R.layout.bottom_sayfa)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.idNavHostFragmentForDrawer) as NavHostFragment
        NavigationUI.setupWithNavController(tasarim.idNavigationView, navHostFragment.navController);

        tasarim.toolbar.title = "DersLer"

        var toggle = ActionBarDrawerToggle(this,tasarim.idDrawer,tasarim.toolbar,0,0)
        tasarim.idDrawer.addDrawerListener(toggle)
        toggle.syncState()

        // baslık tasarımını ekler
        val baslik = tasarim.idNavigationView.inflateHeaderView(R.layout.navigation_baslik)
        val textViewBaslik = baslik.findViewById(R.id.idTextBaslik) as TextView
        textViewBaslik.text = "TOLGS SHOW"

    }

    override fun onBackPressed() {
        if(tasarim.idDrawer.isDrawerOpen(GravityCompat.START)){
            tasarim.idDrawer.closeDrawer(GravityCompat.START)
        }else{
            super.onBackPressed()
        }
    }
}