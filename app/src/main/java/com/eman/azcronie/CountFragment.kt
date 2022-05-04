package com.eman.azcronie

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.eman.azcronie.databinding.FragmentCountBinding


class CountFragment : Fragment(R.layout.fragment_count) {
    private lateinit var binding: FragmentCountBinding
    private lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCountBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()
        // no need for this line because you have already hidden the action bar
//        activity.supportActionBar?.title = ""


        binding.button.setOnClickListener {


            val text = binding.ED.text.toString()
            when {
                text.isEmpty() -> {
                    Toast.makeText(requireContext(), "ادخل عدد", Toast.LENGTH_SHORT).show()
                } // zero is not valid
                text.toInt() == 0 -> {
                    Toast.makeText(
                        requireContext(),
                        "من فضلك ادخل رقم اكبر من الصفر",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                else -> {
                    val y = arguments?.getInt("pos")
                    val bundle1 = bundleOf("yy" to y, "text" to text)
                    // why use use view.findNavController if you already sat navController
                    //                view.findNavController()
                    navController.navigate(R.id.action_countFragment2_to_zecrFragment2, bundle1)
                }
            }

        }
    }
}