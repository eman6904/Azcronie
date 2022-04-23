package com.example.azcronie

import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.azcronie.databinding.FragmentResalaBinding
import com.example.azcronie.databinding.Itemmodel2Binding
import com.example.azcronie.databinding.ItemmodelBinding

class Adapter2(private val list: ArrayList<ItemModel2>) :
    RecyclerView.Adapter<Adapter2.ViewHolder>() {
    inner class ViewHolder(binding: Itemmodel2Binding) : RecyclerView.ViewHolder(binding.root) {
        var text1 = binding.t1
        var counter = binding.t2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            Itemmodel2Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.text1.text = item.text
        holder.counter.text = item.counter.toString()
        var cnt = holder.counter.text.toString().toInt()


        holder.text1.setOnClickListener {
            cnt--
            holder.counter.text = cnt.toString()
            if (cnt == 0) {
                list.removeAt(position)
                notifyItemRemoved(position)
                notifyItemRangeChanged(position, list.size)
                Log.d("pos", position.toString())
                Log.d("size", list.size.toString())
                if (list.size == 0) {
                    it.findNavController().navigate(R.id.action_blankFragment_to_chooseFragment2)
                }

            }

        }
//
//        holder.text1.setOnClickListener {
//            cnt--
//            holder.counter.text = cnt.toString()
//            if (cnt <= 0) {
//                cnt = 0
//                holder.text1.setBackgroundColor(Color.parseColor("#808080"))
//                notifyItemChanged(position)
//            }
//        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
