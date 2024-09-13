package com.example.recyclersviews.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclersviews.R
import com.example.recyclersviews.superHeroe

class superHeroeViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val superHeroN= view.findViewById<TextView>(R.id.tvSuperHeroeName)
    val realName=view.findViewById<TextView>(R.id.tvrealName)
    val publisher=view.findViewById<TextView>(R.id.tvPublisher)
    val foto = view.findViewById<ImageView>(R.id.ivfoto)

    fun render(superHeroeModel:superHeroe){
        superHeroN.text= superHeroeModel.superHeroe
        realName.text= superHeroeModel.realName
        publisher.text= superHeroeModel.Publisher
        foto.setImageResource(superHeroeModel.foto)
    }
}