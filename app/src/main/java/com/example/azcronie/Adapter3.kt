package com.example.azcronie

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.azcronie.databinding.Itemmodel3Binding
import com.example.azcronie.databinding.ItemmodelBinding

class Adapter3(private val list1: ArrayList<ItemModel3>) : RecyclerView.Adapter<Adapter3.ViewHolder>() {
    inner class ViewHolder(val binding: Itemmodel3Binding) : RecyclerView.ViewHolder(binding.root) {
        val image = binding.imageView2
    }
    val A=ArrayList<Int>()
    fun SetImage(){
        A.add(R.drawable.k294)
        A.add(R.drawable.k295)
        A.add(R.drawable.k296)
        A.add(R.drawable.k297)
        A.add(R.drawable.k298)
        A.add(R.drawable.k299)
        A.add(R.drawable.k300)
        A.add(R.drawable.k301)
        A.add(R.drawable.k302)
        A.add(R.drawable.k303)
        A.add(R.drawable.k304)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            Itemmodel3Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item=list1[position]
        holder.image.setOnClickListener{
            Toast.makeText(it.context,position.toString(), Toast.LENGTH_SHORT).show()
        }
        SetImage()
        holder.image.setImageResource(A[position])
    }

    override fun getItemCount(): Int {
        return list1.size
    }

}