package com.eman.azcronie

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.eman.azcronie.databinding.ItemmodelBinding


class AlmspahaAdapter(private val list1: ArrayList<ItemModel>) :
    RecyclerView.Adapter<AlmspahaAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: ItemmodelBinding) : RecyclerView.ViewHolder(binding.root) {
        var text = binding.textView3
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemmodelBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list1[position]
        holder.text.text = "${position + 1}-" + item.text

        holder.binding.root.setOnClickListener {

            holder.binding.root.setBackgroundColor(Color.parseColor("#FFD6A23B"))

            val bundle = bundleOf("pos" to position)
            it.findNavController().navigate(R.id.action_recyclerFragment2_to_countFragment2, bundle)

        }
    }

    override fun getItemCount(): Int {
        return list1.size
    }

}