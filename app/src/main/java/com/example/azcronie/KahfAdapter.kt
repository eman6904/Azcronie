package com.example.azcronie

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.azcronie.databinding.Itemmodel3Binding

class KahfAdapter(private val list1: ArrayList<ItemModel3>) :
    RecyclerView.Adapter<KahfAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: Itemmodel3Binding) : RecyclerView.ViewHolder(binding.root) {
        val image = binding.imageView2
    }

    val A = ArrayList<Int>()

    // never forget functions starts with small letter
    fun setImage() {
        A.add(R.drawable.kkk3)
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
        val item = list1[position]
        holder.image.setOnClickListener {
            Toast.makeText(it.context, position.toString(), Toast.LENGTH_SHORT).show()
        }
        setImage()
        holder.image.setImageResource(A[position])
    }

    override fun getItemCount(): Int {
        return list1.size
    }

}