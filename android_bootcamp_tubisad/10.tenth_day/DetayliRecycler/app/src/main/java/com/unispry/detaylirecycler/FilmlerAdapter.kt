package com.unispry.detaylirecycler

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.unispry.detaylirecycler.databinding.CardTasarimBinding
import com.unispry.detaylirecycler.databinding.FragmentAnasayfaBinding

class FilmlerAdapter(var mContext:Context, var filmlerListesi:List<Filmler>)
    : RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(tasarim:CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim:CardTasarimBinding
        init{
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = CardTasarimBinding.inflate(layoutInflater, parent, false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        var film = filmlerListesi.get(position)
        val t = holder.tasarim

        t.imageViewFilmResim.setImageResource(
            mContext.resources.getIdentifier(film.filmResimAdi, "drawable", mContext.packageName))
        t.textViewFilmAdi.text = film.filmAdi
        t.textViewFilmFiyat.text = "${film.filmFiyat} ₺"

        t.buttonSepeteEkle.setOnClickListener {
            Snackbar.make(it,"${film.filmAdi} sepete eklendi.", Snackbar.ANIMATION_MODE_SLIDE).show()
        }

        t.cardViewFilm.setOnClickListener{
            val gecis = AnasayfaFragmentDirections.detayGecis(film = film)
            Navigation.findNavController(it).navigate(gecis)
        }

        t.imageViewDahaFazla.setOnClickListener{
            val popup = PopupMenu(mContext,it)
            popup.menuInflater.inflate(R.menu.popup_menu,popup.menu)
            popup.show()

            popup.setOnMenuItemClickListener {
                when (it.itemId){
                    R.id.action_haber_ver -> {
                        Snackbar.make(t.imageViewDahaFazla, "${film.filmAdi} filmin gösteriminden haberdar olmak için takip ediliyor.", Snackbar.LENGTH_SHORT).show()
                        true
                    }
                    R.id.action_favorilere_ekle -> {
                        Snackbar.make(t.imageViewDahaFazla, "${film.filmAdi} Favorilere eklendi.", Snackbar.LENGTH_SHORT).show()
                        true
                    }
                    else -> false
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return filmlerListesi.size
    }

}