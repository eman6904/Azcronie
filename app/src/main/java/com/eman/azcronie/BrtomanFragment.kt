package com.eman.azcronie

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.eman.azcronie.databinding.FragmentBrBinding

class BrtomanFragment : Fragment(R.layout.fragment_br) {

    private lateinit var binding: FragmentBrBinding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBrBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()
//        activity.supportActionBar?.title = ""

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