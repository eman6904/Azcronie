package com.example.azcronie

import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.azcronie.databinding.FragmentCountBinding


class CountFragment : Fragment(R.layout.fragment_count) {
    private lateinit var binding: FragmentCountBinding
    private lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCountBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()
        activity.supportActionBar?.title = ""


        binding.button.setOnClickListener {


            val text = binding.ED.text.toString()
            if (text.isNullOrEmpty()) {
                Toast.makeText(requireContext(), "ادخل عدد", Toast.LENGTH_SHORT).show()
            } else {
                val y = arguments?.getInt("pos")
                val bundle1 = bundleOf("yy" to y, "text" to text)
                view.findNavController()
                    .navigate(R.id.action_countFragment2_to_zecrFragment2, bundle1)
            }

        }
    }
}