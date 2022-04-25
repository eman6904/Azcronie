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

import com.example.azcronie.databinding.FragmentChoose2Binding


class ChooseFragment2 : Fragment(R.layout.fragment_choose2) {

    private lateinit var binding: FragmentChoose2Binding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentChoose2Binding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()
        binding.ss.setOnClickListener{
            val bundle1 = bundleOf("number" to 1)
            view.findNavController()
                .navigate(R.id.action_chooseFragment2_to_blankFragment, bundle1)
        }
        binding.mm.setOnClickListener{
            val bundle1 = bundleOf("number" to 2)
            view.findNavController()
                .navigate(R.id.action_chooseFragment2_to_blankFragment, bundle1)
        }
        binding.tt.setOnClickListener{
            navController.navigate(R.id.action_chooseFragment2_to_recyclerFragment2)
        }
        binding.kk.setOnClickListener{
            navController.navigate(R.id.action_chooseFragment2_to_brFragment)
        }
        binding.ww.setOnClickListener{
            navController.navigate(R.id.action_chooseFragment2_to_finalFragment2)
        }
        binding.pp.setOnClickListener{
            navController.navigate(R.id.action_chooseFragment2_to_resaleFragment3)
        }

    }

    }