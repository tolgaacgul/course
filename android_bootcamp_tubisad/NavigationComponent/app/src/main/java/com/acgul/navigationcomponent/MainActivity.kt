package com.acgul.navigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.acgul.navigationcomponent.databinding.BottomSayfaBinding
import com.acgul.navigationcomponent.databinding.DrawerSayfaBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : DrawerSayfaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        tasarim = DrawerSayfaBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        // ssyfa_alt_yapilari_nav.xml ile menu_tasarm.xml yarpılarını birleştireceğiz. nav control görevi görecek
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        NavigationUI.setupWithNavController(tasarim.NavigationView, navHostFragment.navController)


        tasarim.toolbar.title = "Başık Yazılır"
        // üst toolbar ile drawer yapısını birleştirelim.
        var toggle = ActionBarDrawerToggle(this, tasarim.drawer, tasarim.toolbar,0,0)
        tasarim.drawer.addDrawerListener(toggle)
        toggle.syncState()

        val baslik = tasarim.NavigationView.inflateHeaderView(R.layout.navigation_baslik)
        val textViewBaslik = baslik.findViewById(R.id.textViewBaslik) as TextView
        textViewBaslik.text = "Tolga Açgül"


    }

    // geri tuşuna basarkenki drawerın davranısıı(Drawer kapanır sonra uygulama kapanır)
    override fun onBackPressed() {
        if(tasarim.drawer.isDrawerOpen(GravityCompat.START)){
            tasarim.drawer.closeDrawer(GravityCompat.START)
        }else{
            super.onBackPressed()
        }
    }
}