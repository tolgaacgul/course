package com.acgul.yolcu360

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.acgul.yolcu360.databinding.CardCarBinding
import com.acgul.yolcu360.databinding.FragmentAnasayfaBinding
import com.google.android.material.snackbar.Snackbar

// List hem arraylisti hem de listi kapsar- parametre gönderirken arraylist göndercez
class CarsAdapter(var mContext:Context, var carList:List<Cars>): RecyclerView.Adapter<CarsAdapter.CardTasarimTutucu>() {
     inner class CardTasarimTutucu(tasarim:CardCarBinding): RecyclerView.ViewHolder(tasarim.root){
          var tasarim:CardCarBinding
          init {
              this.tasarim = tasarim
          }
     }

     // implement members
     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
          val layoutInflater = LayoutInflater.from(mContext)
          val tasarim = CardCarBinding.inflate(layoutInflater, parent, false)
          return CardTasarimTutucu(tasarim)
     }

     override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
          val car = carList.get(position)
          val t = holder.tasarim
          t.imageViewRentalCar.setImageResource(
               mContext.resources.getIdentifier(car.image_name, "drawable", mContext.packageName))
          t.imageViewCompany.setImageResource(
               mContext.resources.getIdentifier(car.company_name, "drawable", mContext.packageName))
          t.textViewBrand.text = car.brand
          t.textViewPrice.text = "₺ ${car.daily_price}"
          t.textViewDepositFee.text = "₺ ${car.deposit_fee}"
          t.textViewFuel.text = "${car.fuel}"
          t.textViewGear.text = "${car.gear}"
          t.textViewKMLimit.text = "${car.km_limit} KM"
          t.textViewSeat.text = "${car.seat}"
          t.textViewVehicleClass.text = car.vehicle_class
          t.textViewVehicleDeliveryMethod.text = car.vehicle_delivery_method
          

          t.cardViewCar.setOnClickListener{

          }

          t.btnRent.setOnClickListener{
               Snackbar.make(it,"${car.brand} aracın detaylarına yönlendiriliyorsunuz...", Snackbar.LENGTH_SHORT).show()
          }
     }

     override fun getItemCount(): Int {
          return carList.size
     }


}