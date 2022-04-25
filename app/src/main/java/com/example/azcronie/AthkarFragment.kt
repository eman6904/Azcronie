package com.example.azcronie

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.azcronie.databinding.AthkarfragmentBinding


class AthkarFragment : Fragment(R.layout.athkarfragment) {
    private lateinit var binding: AthkarfragmentBinding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = AthkarfragmentBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()

        val number = arguments?.getInt("number")
        val n = arguments?.getInt("key")
        val p = ArrayGroup()
        // use when faster and easier and less code
        when (n) {
            1 -> {
                binding.t1.text = "أذكار الصلاة"
                val adapter = AthkarAdapter(p.setSalah())
                binding.re.layoutManager = LinearLayoutManager(requireContext())
                binding.re.adapter = adapter
            }
            2 -> {
                binding.t1.text = "أذكار المسجد"
                val adapter = AthkarAdapter(p.setMsgedd())
                binding.re.layoutManager = LinearLayoutManager(requireContext())
                binding.re.adapter = adapter
            }
            3 -> {
                binding.t1.text = "أذكار النوم"
                val adapter = AthkarAdapter(p.setSleep())
                binding.re.layoutManager = LinearLayoutManager(requireContext())
                binding.re.adapter = adapter
            }
            4 -> {
                binding.t1.text = "أذكار الاستيقاظ"
                val adapter = AthkarAdapter(p.setWakeup())
                binding.re.layoutManager = LinearLayoutManager(requireContext())
                binding.re.adapter = adapter
            }
        }

        if (number == 1) {
            binding.t1.text = "أذكار الصباح"
            val adapter = AthkarAdapter(p.setMorning())
            binding.re.layoutManager = LinearLayoutManager(requireContext())
            binding.re.adapter = adapter
        } else if (number == 2) {
            val adapter = AthkarAdapter(p.setEvening())
            binding.re.layoutManager = LinearLayoutManager(requireContext())
            binding.re.adapter = adapter
        }
    }


}