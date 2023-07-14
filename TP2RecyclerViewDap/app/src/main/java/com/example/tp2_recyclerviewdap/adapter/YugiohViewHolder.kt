package com.example.tp2_recyclerviewdap.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tp2_recyclerviewdap.yugioh
import com.example.tp2_recyclerviewdap.R

class yugiohViewHolder(view: View):RecyclerView.ViewHolder(view){

    val card= view.findViewById<TextView>(R.id.card)
    val type = view.findViewById<TextView>(R.id.type)
    val atk = view.findViewById<TextView>(R.id.atk)
    val def = view.findViewById<TextView>(R.id.def)
    val photo = view.findViewById<ImageView>(R.id.imageView)


    fun render(yugiohmodel: yugioh){
        card.text = yugiohmodel.Card
        type.text = yugiohmodel.Type
        atk.text = yugiohmodel.Atk.toString()
        def.text = yugiohmodel.Def.toString()
        Glide.with(photo.context).load(yugiohmodel.photo).into(photo)




    }
}