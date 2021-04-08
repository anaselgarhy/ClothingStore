package com.example.clothingstore.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.clothingstore.components
import com.example.clothingstore.R
import kotlinx.android.synthetic.main.activity_view_components.view.*

class ItemsAdapter(var items: ArrayList<components>): RecyclerView.Adapter<ItemsAdapter.ViewHolder>() {




    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val item_name = itemView.componentsName as TextView
        val item_salary = itemView.componentsSalary as TextView
        val item_img = itemView.componentsImage as ImageView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val x = LayoutInflater.from(parent.context).inflate(R.layout.activity_view_components, parent, false)
        return ViewHolder(x)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val components: components = items[position]
        holder.item_name.text = components.name
        holder.item_salary.text = components.salary.toString()
        holder.item_img.setImageResource(components.img)
    }

    override fun getItemCount(): Int {
        return items.size
    }

}