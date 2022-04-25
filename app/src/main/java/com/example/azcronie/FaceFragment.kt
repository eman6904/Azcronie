package com.example.azcronie

import android.app.PendingIntent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.azcronie.databinding.FragmentFaceBinding
import kotlinx.coroutines.Delay


class FaceFragment : Fragment(R.layout.fragment_face) {
    private lateinit var binding: FragmentFaceBinding
    private lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFaceBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()

        binding.textView1.animate().translationYBy(600f).scaleXBy(3f).scaleYBy(3f).duration =
            2000
        binding.textView2.animate().translationYBy(-580f).scaleXBy(3f).scaleYBy(3f).duration =
            2000

        Handler(Looper.getMainLooper()).postDelayed({
            navController.navigate(R.id.action_faceFragment_to_chooseFragment2)

        }, 2000)



    }

}