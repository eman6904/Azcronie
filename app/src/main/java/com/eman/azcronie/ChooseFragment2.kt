package com.eman.azcronie

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.eman.azcronie.databinding.FragmentChoose2Binding
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener


class ChooseFragment2 : Fragment(R.layout.fragment_choose2) {

    private lateinit var binding: FragmentChoose2Binding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentChoose2Binding.bind(view)
        navController = Navigation.findNavController(view)


        //ads

        MobileAds.initialize(requireContext(),
            OnInitializationCompleteListener { initializationStatus -> //Showing a simple Toast Message to the user when The Google AdMob Sdk Initialization is Completed

            })

        val adRequest = AdRequest.Builder().build()
       binding.bannerAdView.loadAd(adRequest)

       binding.bannerAdView.adListener = object: AdListener() {
            override fun onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            override fun onAdFailedToLoad(adError : LoadAdError) {
                // Code to be executed when an ad request fails.
            }

            override fun onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            override fun onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            override fun onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        }



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