package com.eman.azcronie

import android.net.Uri
import android.os.Bundle
import android.text.Editable
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.eman.azcronie.MainActivity
import com.eman.azcronie.R
import com.eman.azcronie.databinding.FragmentEndBinding

class EndFragment : Fragment(R.layout.fragment_end) {



    private lateinit var binding: FragmentEndBinding
    private lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentEndBinding.bind(view)
        navController = Navigation.findNavController(view)

       binding.imageView7.animate().alpha(1f).duration=3000
    }


}