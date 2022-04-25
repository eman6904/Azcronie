package com.example.azcronie

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.azcronie.databinding.Itemmodel2Binding

class AthkarAdapter(private val list: ArrayList<ItemModel2>) :
    RecyclerView.Adapter<AthkarAdapter.ViewHolder>() {
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

        // you can put if condition inside an assignment process but it must has else part
//        holder.counter.text = if (item.counter > 0) item.counter.toString() else "تم"
        if (item.counter > 0) {
            holder.counter.text = item.counter.toString()
            holder.text1.setBackgroundColor(Color.parseColor("#070F40"))
        }else {
            holder.counter.text = "تم"
            holder.text1.setBackgroundColor(Color.parseColor("#4C1723"))
        }

        try {
            // this try part because if counter.text = "تم" it can't be converted into toInt so it will cause exception
            var cnt = holder.counter.text.toString().toInt()
            // now holder.counter.text == "done"
            // how "done" can be converted into a number??
            // so it will throw an error --> can't convert string to number
            holder.text1.setOnClickListener {
                cnt--
                if (cnt > 0) {
                    holder.counter.text = cnt.toString()
                    item.counter = cnt
                    holder.text1.setBackgroundColor(Color.parseColor("#070F40"))
                } else {
                    holder.counter.text = "تم"
                    item.counter = cnt
                    holder.text1.setBackgroundColor(Color.parseColor("#4C1723"))
                }
            }
        } catch (ex: Exception) {
        }


//        holder.text1.setOnClickListener {
//            cnt--
//            holder.counter.text = cnt.toString()
//            if (cnt == 0) {
//                list.removeAt(position)
//                notifyItemRemoved(position)
//                notifyItemRangeChanged(position, list.size)
//                Log.d("pos", position.toString())
//                Log.d("size", list.size.toString())
//                if (list.size == 0) {
//                    it.findNavController().navigate(R.id.action_blankFragment_to_chooseFragment2)
//                }
//
//            }
//
//        }

    }

    override fun getItemCount(): Int {
        return list.size
    }
}
