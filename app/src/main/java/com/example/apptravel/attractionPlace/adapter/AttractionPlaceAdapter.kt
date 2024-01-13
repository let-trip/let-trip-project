package com.example.apptravel.attractionPlace.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apptravel.R
import com.example.apptravel.adapter.BaseLoadMoreAdapter
import com.example.apptravel.databinding.ListItemAttractionPlaceBinding
import com.example.apptravel.attractionPlace.dataModel.AttractionPlace
import com.example.apptravel.utility.ExtensionUtil.loadImageView

class AttractionPlaceAdapter(data: ArrayList<AttractionPlace> = arrayListOf()) :
    BaseLoadMoreAdapter<AttractionPlace>(data) {

    private var onItemClickCallback: ((Int, AttractionPlace) -> Unit)? = null

    override fun onCreateChildViewHolder(
        parent: ViewGroup, viewType: Int
    ): RecyclerView.ViewHolder {
        val itemBinding = ListItemAttractionPlaceBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ItemViewHolder(itemBinding)
    }

    override fun onBindChildViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ItemViewHolder) {
            holder.bindData(data[position], onItemClickCallback)
        }
    }

    fun onItemClickCallback(callback: (Int, AttractionPlace) -> Unit) {
        this.onItemClickCallback = callback
    }

    class ItemViewHolder(private val binding: ListItemAttractionPlaceBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindData(place: AttractionPlace, onItemClick: ((Int, AttractionPlace) -> Unit)?) {
            if (place.images.isNotEmpty()) {
                place.images[0].let {
                    binding.imageLogo.loadImageView(it.url)
                }
            } else {
                binding.imageLogo.setImageResource(R.drawable.ic_photo)
            }
            binding.textviewName.text = place.name
            binding.textviewIntroduction.text = place.introduction
            binding.root.setOnClickListener {
                onItemClick?.let {
                    onItemClick.invoke(adapterPosition, place)
                }
            }
        }
    }
}