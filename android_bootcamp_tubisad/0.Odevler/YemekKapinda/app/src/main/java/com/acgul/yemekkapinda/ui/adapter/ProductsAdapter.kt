package com.acgul.yemekkapinda.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.acgul.yemekkapinda.R
import com.acgul.yemekkapinda.data.model.Products
import com.acgul.yemekkapinda.databinding.CardOfProductsBinding
import com.acgul.yemekkapinda.ui.fragment.BasketFragment
import com.acgul.yemekkapinda.ui.fragment.MainFragmentDirections
import com.google.android.material.snackbar.Snackbar

//1. parametre tanımla
class ProductsAdapter(var mContext: Context, var productList:List<Products>)
    : RecyclerView.Adapter<ProductsAdapter.CardOfProductHandler>() { //3. innerclası adaptera bağla
    //2. card tasarım sınıfı oluştur
    inner class CardOfProductHandler(vw:CardOfProductsBinding): RecyclerView.ViewHolder(vw.root){
        var vw:CardOfProductsBinding
        init{
            this.vw = vw
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardOfProductHandler {
        val layoutInflater = LayoutInflater.from(mContext)
        val vw = CardOfProductsBinding.inflate(layoutInflater, parent, false)
        return CardOfProductHandler(vw)
    }

    override fun onBindViewHolder(holder: CardOfProductHandler, position: Int) {
        val product = productList.get(position)
        val h = holder.vw
        var count = 0
        h.textViewName.text = "${product.name}"

        h.cardProduct.setOnClickListener {
            val go = MainFragmentDirections.actionMainFragmentToDetailFragment(product = product)
            Navigation.findNavController(it).navigate(go)
        }
        h.imageViewMore.setOnClickListener{
            val popup = PopupMenu(mContext,it)
            popup.menuInflater.inflate(R.menu.main_page_popup_menu,popup.menu)
            popup.show()

            popup.setOnMenuItemClickListener {
                when(it.itemId){
                    R.id.action_add_favori -> {
                        Snackbar.make(h.imageViewMore,"${product.name} ürünü favorilendi", Snackbar.LENGTH_SHORT).show()
                        true
                    }
                    R.id.action_later_on -> {
                        Snackbar.make(h.imageViewMore, "${product.name} ürünü için fazla bilgi yok.",Snackbar.LENGTH_SHORT).show()
                        true
                    }
                    else -> false
                }
            }
        }
        h.imageViewAddToBasket.setOnClickListener{
            if(count == 0){
                Snackbar.make(h.root,"${product.name} 'dan en 1 adet seçiniz.", Snackbar.LENGTH_SHORT).show()
            }else{
                Snackbar.make(h.root,"${product.name} 'dan ${count} adet sepete eklensin mi?", Snackbar.LENGTH_SHORT)
                    .setAction("Evet"){
                        Snackbar.make(h.root,"${product.name} 'dan ${count} adet sepete eklendi", Snackbar.LENGTH_SHORT).show()
                    }.show()
            }
        }
        h.imageViewProduct.setImageResource(mContext.resources.getIdentifier(product.image,"drawable",mContext.packageName))
        h.textViewCnt.text = count.toString()
        h.buttonPstv.setOnClickListener {
            count += 1
            h.textViewCnt.text = count.toString()
        }
        h.buttonNgtv.setOnClickListener {
            if(count == 0){
                Snackbar.make(it,"Sipariş adediniz 0 veya 0'dan büyük olmalı !", Snackbar.LENGTH_SHORT).show()
            }else if(count > 0){
                count -= 1
                h.textViewCnt.setText(count.toString())
            }
        }
        h.buttonAddAndGoBasket.setOnClickListener {

        }
    }

    // recycler view için adet sayı
    override fun getItemCount(): Int {
        return productList.size //4. satır sayısı belirle
    }
}