package com.example.azcronie

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.azcronie.databinding.FragmentResalaBinding

class ResaleFragment : Fragment(R.layout.fragment_resala) {
    private lateinit var binding: FragmentResalaBinding
    private lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentResalaBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()
        val A = ArrayList<ItemModel3>()
        A.add(ItemModel3(R.drawable.k293))
        A.add(ItemModel3(R.drawable.k294))
        A.add(ItemModel3(R.drawable.k295))
        A.add(ItemModel3(R.drawable.k296))
        A.add(ItemModel3(R.drawable.k297))
        A.add(ItemModel3(R.drawable.k298))
        A.add(ItemModel3(R.drawable.k299))
        A.add(ItemModel3(R.drawable.k300))
        A.add(ItemModel3(R.drawable.k301))
        A.add(ItemModel3(R.drawable.k302))
        A.add(ItemModel3(R.drawable.k303))

        val adapter = Adapter3(A)
        binding.re.layoutManager = LinearLayoutManager(requireContext())
        binding.re.adapter = adapter
    }

}