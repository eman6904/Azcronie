package com.example.azcronie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.azcronie.databinding.FragmentBlankBinding
import com.example.azcronie.databinding.FragmentBrBinding


class BlankFragment : Fragment(R.layout.fragment_blank) {
    private lateinit var binding: FragmentBlankBinding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBlankBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()

        val number = arguments?.getInt("number")


        val p = ArrayGroup()
        if (number == 1) {
            binding.t1.text = "أذكار الصباح"
            val adapter = Adapter2(p.setMorning())
            binding.re.layoutManager = LinearLayoutManager(requireContext())
            binding.re.adapter = adapter
        } else {
            val adapter = Adapter2(p.setEvening())
            binding.re.layoutManager = LinearLayoutManager(requireContext())
            binding.re.adapter = adapter
        }
    }


}