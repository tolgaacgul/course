package com.acgul.yemekkapinda.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.acgul.yemekkapinda.R
import com.acgul.yemekkapinda.data.model.Products
import com.acgul.yemekkapinda.databinding.FragmentMainBinding
import com.acgul.yemekkapinda.ui.adapter.ProductsAdapter
import com.google.android.material.snackbar.Snackbar

class MainFragment : Fragment(), SearchView.OnQueryTextListener {
    private lateinit var vw : FragmentMainBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        vw = FragmentMainBinding.inflate(inflater, container, false)
        vw.toolbarMain.title = "Yemek Listesi"

        // toolbar_menu.xml için
        // Activity de çalışan ama fragment da erişilmeyen özellikler için bu kodlamayı yaz
        (activity as AppCompatActivity).setSupportActionBar(vw.toolbarMain)


        vw.rview.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val productList = ArrayList<Products>()
        val p1 = Products(1,"Lahmacun",4, "add_product")
        val p2 = Products(2,"Pizza",1,"basket")
        val p3 = Products(3,"Kola",2,"pizza_resim")
        val p4 = Products(4,"Selpak",2,"search")
        val p5 = Products(5,"Pide",1,"arrow_forward")

        productList.add(p1)
        productList.add(p2)
        productList.add(p3)
        productList.add(p4)
        productList.add(p5)

        val adapter = ProductsAdapter(requireContext(), productList)
        vw.rview.adapter = adapter

        vw.fab.setOnClickListener{
            // fragmentlar arası geçiş
            // Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_detailFragment)

            var product = Products(415,"Kaşar Pizza", 0,"R.drawable.pizza_resim")
            // veri gonderme işlemi yapacak
            val goToPage = MainFragmentDirections.actionMainFragmentToDetailFragment(product)
            Navigation.findNavController(it).navigate(goToPage)
        }



        return vw.root
    }

    // toolbar_menu.xml için
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    //toolbar_menu.xml itemlerına tıklandığında
    /*
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_exit-> {
                Snackbar.make(vw.root,"Çıkış yapıldı",Snackbar.LENGTH_SHORT).show()
                return true
            }
            R.id.action_search -> {
                Snackbar.make(vw.root,"Arama yapıldı",Snackbar.LENGTH_SHORT).show()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }

    }
    */

    // toolbar_menu.xml için
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.toolbar_menu, menu)

        val item = menu.findItem(R.id.action_search)
        var searchView = item.actionView as SearchView
        searchView.setOnQueryTextListener(this)

        super.onCreateOptionsMenu(menu, inflater)
    }
    // toolbar_menu deki arama için "SearchView.OnQueryTextListener" interfaci eklendi. bu fonklar onun
    override fun onQueryTextSubmit(p0: String): Boolean {  //klavyedi arama butonunana basıldığında
        search(p0)
        return true
    }
    override fun onQueryTextChange(p0: String): Boolean {  //tuşlara bastıkça
        search(p0)
        return true
    }

    fun search(searchWords:String){
        Log.e("Fonksiyon", "${searchWords} aranıyor...")
        Snackbar.make(vw.root,"$searchWords kelimesi aranıyor",Snackbar.LENGTH_SHORT).show()
    }
}