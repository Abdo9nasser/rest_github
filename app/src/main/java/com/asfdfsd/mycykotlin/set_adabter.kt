package com.asfdfsd.mycykotlin

import android.annotation.SuppressLint
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class set_adabter(val list:ArrayList<data>): RecyclerView.Adapter<set_adabter.view_holder>() {
     class view_holder( val viewitem :View) : RecyclerView.ViewHolder(viewitem) {
         val name :TextView =viewitem.findViewById(R.id.name)
         val sub_name:TextView =viewitem.findViewById(R.id.sub_name)
         val img1:ImageView =viewitem.findViewById(R.id.img)

     }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): view_holder {
val view :View =LayoutInflater.from(parent.context).inflate(R.layout.items,parent,false)
    return view_holder(view)
    }

    override fun onBindViewHolder(holder: view_holder, @SuppressLint("RecyclerView") position: Int) {
        val host :data =list.get(position)
        holder.img1.setImageResource(host.img)
        holder.name.text=host.name
        holder.sub_name.text=host.sub
        holder.img1.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0: View?) {
                opinclick?.inclick(host,position)
            }
        })


    }
    var opinclick : initemclick? =null
   interface initemclick{
       fun inclick(host :data ,position: Int)
   }


    override fun getItemCount(): Int {
return list.size   }
}

