package com.example.azcronie

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.azcronie.databinding.FragmentBrBinding
import kotlin.random.Random

class BrFragment : Fragment(R.layout.fragment_br) {

    private lateinit var binding: FragmentBrBinding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBrBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.show()
        activity.supportActionBar?.title = ""

        // to generate a random number
        binding.text.setOnClickListener {
            val pos = (0..56).random()

            // to test in logcat
            Log.d("random", pos.toString())

            val bundle = bundleOf("p" to pos)
            navController.navigate(R.id.action_brFragment_to_lastFragment, bundle)

        }

    }

}