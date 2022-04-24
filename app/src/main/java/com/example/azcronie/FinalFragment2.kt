package com.example.azcronie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.azcronie.databinding.FragmentBlankBinding
import com.example.azcronie.databinding.FragmentFinal2Binding


class FinalFragment2 : Fragment(R.layout.fragment_final2) {
    private lateinit var binding: FragmentFinal2Binding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFinal2Binding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()
        binding.salah.setOnClickListener {
            val bundle1 = bundleOf("key" to 1 )
            view.findNavController()
                .navigate(R.id.action_finalFragment2_to_blankFragment, bundle1)
        }
        binding.msged.setOnClickListener {
            val bundle1 = bundleOf("key" to 2 )
            view.findNavController()
                .navigate(R.id.action_finalFragment2_to_blankFragment, bundle1)
        }
        binding.noom.setOnClickListener {
            val bundle1 = bundleOf("key" to 3 )
            view.findNavController()
                .navigate(R.id.action_finalFragment2_to_blankFragment, bundle1)
        }
        binding.astikas.setOnClickListener {
            val bundle1 = bundleOf("key" to 4 )
            view.findNavController()
                .navigate(R.id.action_finalFragment2_to_blankFragment, bundle1)
        }
    }
}