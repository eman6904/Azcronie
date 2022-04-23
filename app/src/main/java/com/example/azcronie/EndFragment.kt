package com.example.azcronie

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
import com.example.azcronie.databinding.FragmentCountBinding
import com.example.azcronie.databinding.FragmentEndBinding

class EndFragment : Fragment(R.layout.fragment_end) {

    // declaring a null variable for VideoView
    var simpleVideoView: VideoView? = null

    // declaring a null variable for MediaController
    var mediaControls: MediaController? = null


    private lateinit var binding: FragmentEndBinding
    private lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentEndBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.show()


        simpleVideoView = binding.simpleVideoView

        if (mediaControls == null) {
            // creating an object of media controller class
            mediaControls = MediaController(binding.root.context)

            // set the anchor view for the video view
            mediaControls!!.setAnchorView(this.simpleVideoView)
        }
        //   set the media controller for video view
        simpleVideoView!!.setMediaController(mediaControls)

        // set the absolute path of the video file which is going to be played
        simpleVideoView!!.setVideoURI(
            Uri.parse(
                "android.resource://"
                        + "com.example.azcronie" + "/" + R.raw.vdo
            )
        )

        simpleVideoView!!.requestFocus()

        // starting the video
        simpleVideoView!!.start()

        // display a toast message
        // after the video is completed
//        simpleVideoView!!.setOnCompletionListener {
//            Toast.makeText(
//                requireContext(), "Video completed",
//                Toast.LENGTH_LONG
//            ).show()
//        }

        // display a toast message if any
        // error occurs while playing the video
        simpleVideoView!!.setOnErrorListener { mp, what, extra ->
            Toast.makeText(
                requireContext(), "An Error Occured " +
                        "While Playing Video !!!", Toast.LENGTH_LONG
            ).show()
            false
        }


    }


}
