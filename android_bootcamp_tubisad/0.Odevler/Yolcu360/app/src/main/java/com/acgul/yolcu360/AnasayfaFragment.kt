package com.acgul.yolcu360

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.acgul.yolcu360.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)

        //tasarim.toolbarAnasayfa.title = "Araçlar"

        //tasarim.rv.layoutManager = LinearLayoutManager(requireContext())  // satır satır bu da kullanılabilir
        tasarim.rv.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL)

        val carList = ArrayList<Cars>()
        val c1 = Cars(1,"logo_enuygun","volvo","Volvo",580.98, "Manuel", "Dizel","Ekonomi",5, "Kapıda Karşılama", 400.44, 1090.99)
        val c2 = Cars(2,"logo_garenta","togg","TOGG",1580.8, "Otomatik", "Benzin","Lüks",5, "Kapı Önü Karşılama", 1020.22, 900.0)
        val c3 = Cars(3,"logo_enuygun","tofas","Şahin",610.98, "Otomatik", "Elektrik","Ekonomi",4, "Terminal içi", 600.44, 850.90)
        val c4 = Cars(4,"logo_tiktak","renault_clio","Mercedes",1080.98, "Manuel", "Hibrit","Ekonomi",4, "Ofis Önünde", 1200.44, 730.90)
        val c5 = Cars(5,"logo_garenta","renault_kangoo","Adadol",980.98, "Manuel", "Gaz","Ekonomi",6, "Havaalanı Giriş", 800.44, 999.99)
        val c6 = Cars(6,"logo_garenta","togg","TOGG",1580.8, "Otomatik", "Benzin","Lüks",5, "Kapı Önü Karşılama", 1020.22, 900.0)
        val c7 = Cars(7,"logo_enuygun","tofas","Şahin",610.98, "Otomatik", "Elektrik","Ekonomi",4, "Terminal içi", 600.44, 850.90)
        val c8 = Cars(8,"logo_tiktak","renault_clio","Mercedes",1080.98, "Manuel", "Hibrit","Ekonomi",4, "Ofis Önünde", 1200.44, 730.90)
        val c9 = Cars(9,"logo_garenta","renault_kangoo","Adadol",980.98, "Manuel", "Gaz","Ekonomi",6, "Havaalanı Giriş", 800.44, 999.99)

        carList.add(c1)
        carList.add(c2)
        carList.add(c3)
        carList.add(c4)
        carList.add(c5)
        carList.add(c6)
        carList.add(c7)
        carList.add(c8)
        carList.add(c9)

        var adapter = CarsAdapter(requireContext(),carList)
        tasarim.rv.adapter = adapter

        return tasarim.root
    }


}