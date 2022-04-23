package com.example.azcronie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.bumptech.glide.Glide
import com.example.azcronie.databinding.FragmentCountBinding
import com.example.azcronie.databinding.FragmentLastBinding

class LastFragment : Fragment(R.layout.fragment_last) {
    private lateinit var binding: FragmentLastBinding
    private lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLastBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()

        val arr = ArrayList<Int>()

        arr.add(R.drawable.ms1)
        arr.add(R.drawable.ms2)
        arr.add(R.drawable.ms3)
        arr.add(R.drawable.ms4)
        arr.add(R.drawable.ms5)
        arr.add(R.drawable.mss6)
        arr.add(R.drawable.mss7)
        arr.add(R.drawable.mss8)
        arr.add(R.drawable.mss9)
        arr.add(R.drawable.ms10)
        arr.add(R.drawable.ms11)
        arr.add(R.drawable.ms12)
        arr.add(R.drawable.ms13)
        arr.add(R.drawable.ms14)
        arr.add(R.drawable.po6)
        arr.add(R.drawable.po5)
        arr.add(R.drawable.po7)
        arr.add(R.drawable.ms18)
        arr.add(R.drawable.ms19)
        arr.add(R.drawable.po2)
        arr.add(R.drawable.ms21)
        arr.add(R.drawable.ms22)
        arr.add(R.drawable.ms23)
        arr.add(R.drawable.ms24)
        arr.add(R.drawable.ms25)
        arr.add(R.drawable.ms26)
        arr.add(R.drawable.ms27)
        arr.add(R.drawable.ms28)
        arr.add(R.drawable.ms29)
        arr.add(R.drawable.po3)
        arr.add(R.drawable.po4)
        arr.add(R.drawable.po9)
        arr.add(R.drawable.po10)
        arr.add(R.drawable.po11)
        arr.add(R.drawable.po12)
        arr.add(R.drawable.po13)
        arr.add(R.drawable.po14)
        arr.add(R.drawable.po15)
        arr.add(R.drawable.po16)
        arr.add(R.drawable.po17)
        arr.add(R.drawable.po18)
        arr.add(R.drawable.po19)
        arr.add(R.drawable.po43)
        arr.add(R.drawable.po44)
        arr.add(R.drawable.po45)
        arr.add(R.drawable.po46)
        arr.add(R.drawable.po47)
        arr.add(R.drawable.po48)
        arr.add(R.drawable.po49)
        arr.add(R.drawable.po50)
        arr.add(R.drawable.po51)
        arr.add(R.drawable.po52)
        arr.add(R.drawable.po53)
        arr.add(R.drawable.po55)
        arr.add(R.drawable.po56)
        arr.add(R.drawable.po57)
        arr.add(R.drawable.po57)
        val idx = arguments?.getInt("p")
//        binding.photo.setImageResource(arr[idx!!])

        // Fist Call Glide our library
        // .with function tells glide where I am
        // .load function takes the source of the image that i want to upload it can be id,drawable, url, whatever source
        // .into function where I am going to put this image
        // note that there are many function like .crop or whatever that enables me to adjust the image or do pre process before uploading it.
        Glide.with(requireContext()).load(arr[idx!!]).into(binding.ms1)
//        Glide.with(requireContext())
//            .load("https://static.remove.bg/remove-bg-web/5cc729f2c60683544f035949b665ce17223fd2ec/assets/start_remove-c851bdf8d3127a24e2d137a55b1b427378cd17385b01aec6e59d5d4b5f39d2ec.png")
//            .into(binding.photo)
//        try this after finishing ^_^
    }
}