package com.example.recyclersviews.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclersviews.R
import com.example.recyclersviews.superHeroe

class superHeroeAdapter (private val superHeroeList:List<superHeroe>) : RecyclerView.Adapter<superHeroeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): superHeroeViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return superHeroeViewHolder(layoutInflater.inflate(R.layout.item_superheroe,parent, false))
    }

    override fun getItemCount(): Int {
        return superHeroeList.size
    }

    override fun onBindViewHolder(holder: superHeroeViewHolder, position: Int) {
        val item = superHeroeList[position]
        holder.render(item)
    }
}