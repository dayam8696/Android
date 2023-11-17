package com.example.recycleview_guide

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MyAdapter(val songs: List<song>):Adapter<MyAdapter.MyviewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view ,parent,false)
        return MyviewHolder(view)
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        holder.texttile.text = songs[position].tittle
        holder.texdecription.text = songs[position].description
        var color ="#ECE3CE"
        if (position%2==0){
            color = "#739072"
        }
        holder.container.setBackgroundColor(Color.parseColor(color))
    }
    override fun getItemCount(): Int {
       return songs.size
    }
    class MyviewHolder(itemView: View) :ViewHolder(itemView){
        var texttile = itemView.findViewById<TextView>(R.id.textTittle)
        var texdecription = itemView.findViewById<TextView>(R.id.textDecription)
        var container = itemView.findViewById<LinearLayout>(R.id.container)
    }

}

