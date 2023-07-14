package com.example.tp2_recyclerviewdap.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tp2_recyclerviewdap.yugioh
import com.example.tp2_recyclerviewdap.R
import com.example.tp2_recyclerviewdap.adapter.yugiohViewHolder


abstract class yugiohAdapter(private val yugiohList:List<yugioh>) : RecyclerView.Adapter<yugiohViewHolder> (){
    var yugiohList: MutableList<yugioh>,
    lateinit var onClick: (yugioh) -> Unit

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): yugiohViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        return yugiohViewHolder(layoutInflater.inflate(R.layout.item_yugioh,parent,false))

    }

    override fun onBindViewHolder(holder: yugiohViewHolder, position: Int) {
        val item = yugiohList[position]
        holder.render(item)

    }

    override fun getItemCount(): Int = yugiohList.size


}