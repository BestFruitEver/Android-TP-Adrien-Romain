package com.example.coronavirus.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.coronavirus.databinding.ItemPaysBinding
import com.example.coronavirus.models.Corona.Country
import com.squareup.picasso.Picasso

class PaysListAdapter(private val pays: List<Country>, val onPaysSelected : (pays: Country) -> Unit) : RecyclerView.Adapter<PaysListAdapter.PaysViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaysViewHolder {
        return PaysViewHolder(ItemPaysBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: PaysViewHolder, position: Int) {
        holder.bind(pays[position])
    }

    inner class PaysViewHolder(private val binding: ItemPaysBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(pays: Country){
            binding.country = pays
            binding.root.setOnClickListener { onPaysSelected(pays) }
        }

    }

    override fun getItemCount() = pays.size

}