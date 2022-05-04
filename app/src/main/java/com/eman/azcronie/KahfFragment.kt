package com.eman.azcronie

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.eman.azcronie.databinding.KahffragmentBinding

class KahfFragment : Fragment(R.layout.kahffragment) {
    private lateinit var binding: KahffragmentBinding
    private lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = KahffragmentBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()
        val arrayList = ArrayList<ItemModel3>()
        arrayList.add(ItemModel3(R.drawable.kkk3))
        arrayList.add(ItemModel3(R.drawable.k293))
        arrayList.add(ItemModel3(R.drawable.k294))
        arrayList.add(ItemModel3(R.drawable.k295))
        arrayList.add(ItemModel3(R.drawable.k296))
        arrayList.add(ItemModel3(R.drawable.k297))
        arrayList.add(ItemModel3(R.drawable.k298))
        arrayList.add(ItemModel3(R.drawable.k299))
        arrayList.add(ItemModel3(R.drawable.k300))
        arrayList.add(ItemModel3(R.drawable.k301))
        arrayList.add(ItemModel3(R.drawable.k302))
        arrayList.add(ItemModel3(R.drawable.k303))

        val adapter = KahfAdapter(arrayList)
        //to scroll left and right
       // binding.re.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        //to scroll up and down
        binding.re.layoutManager = LinearLayoutManager(requireContext())
        binding.re.adapter = adapter
    }

}