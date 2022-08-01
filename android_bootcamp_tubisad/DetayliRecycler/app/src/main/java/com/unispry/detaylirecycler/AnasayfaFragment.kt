package com.unispry.detaylirecycler

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.unispry.detaylirecycler.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)

        tasarim.toolbarAnasayfa.title = "Filmler"
        tasarim.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val filmlerListesi = ArrayList<Filmler>()
        val f1 = Filmler(1,"Anadoluda", "resim1", 2008, 7.0, "Nuri Bilge Ceylan")
        val f2 = Filmler(2,"Django", "resim2", 2018, 6.0, "Nuri Kapkaçak")
        val f3 = Filmler(3,"İncepiton", "resim3", 1908, 4.90, "Hasan Yiğit")
        val f4 = Filmler(4,"Geleceğe donus", "resim4", 1998, 9.10, "Hans Zimmer")
        val f5 = Filmler(5,"Maniak", "resim5", 2015, 1.90, "Faseri Kaston")
        val f6 = Filmler(6,"Aşk101", "resim6", 2021, 7.99, "Hasan Can Kaya")
        filmlerListesi.add(f1)
        filmlerListesi.add(f2)
        filmlerListesi.add(f3)
        filmlerListesi.add(f4)
        filmlerListesi.add(f5)
        filmlerListesi.add(f6)

        val adapter = FilmlerAdapter(requireContext(), filmlerListesi)
        tasarim.rv.adapter = adapter

        return tasarim.root
    }

}