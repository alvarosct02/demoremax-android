package com.kamiz.demoremax.ui.property.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kamiz.demoremax.data.models.Property
import com.kamiz.demoremax.databinding.ItemPropertyBinding

class PropertyAdapter(
    private val objList: List<Property>
) : RecyclerView.Adapter<PropertyAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemPropertyBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemPropertyBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val obj = objList[position]
        holder.binding.tvName.text = obj.name
        holder.binding.tvPrice.text = obj.formattedPrice()
        holder.binding.container.setOnClickListener {
//            TODO: Open detail view
        }
    }

    override fun getItemCount(): Int = objList.size
}