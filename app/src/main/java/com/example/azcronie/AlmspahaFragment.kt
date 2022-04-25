package com.example.azcronie

import android.graphics.Color
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.azcronie.databinding.AlmspahafragmentBinding



class AlmspahaFragment : Fragment(R.layout.almspahafragment) {
    private lateinit var binding: AlmspahafragmentBinding
    private lateinit var navController: NavController
    private val text = ArrayList<String>()
    private fun setupArray() {
        text.add("✨سبحان الله✨")
        text.add("✨الحمد لله✨")
        text.add("✨لا اله الا الله ✨")
        text.add("✨الله اكبر✨")
        text.add("✨استغفر الله العظيم✨")
        text.add("✨لا حول ولا قوة الا بالله✨")
        text.add("✨سبحان الله بحمده سبحان الله العظيم✨")
        text.add("✨لا اله الا انت سبحانك اني كنت من الظالمين✨")
        text.add("✨اللهم صلي ع سيدنا محمد(ص)✨")

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = AlmspahafragmentBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.show()

        val t = arguments?.getString("text")
        var g: Int = t!!.toInt()
        binding.textView5.text = g.toString()


        setupArray()
        val z = arguments?.getInt("yy")
        binding.textView6.text = text[z!!]


        binding.imageView4.setOnClickListener {
            g--
            binding.textView5.text = g.toString()
            if (g == 0) {
                navController.navigate(R.id.action_zecrFragment2_to_endFragment2)
            }
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item?.itemId) {
            R.id.green -> {
                binding.imageView4.setImageResource(R.drawable.green)
                binding.fr.setBackgroundColor(Color.parseColor("#FF018786"))
            }
            R.id.red -> {
                binding.imageView4.setImageResource(R.drawable.red)
                binding.fr.setBackgroundColor(Color.parseColor("#304731"))
            }
            R.id.beige -> {
                binding.imageView4.setImageResource(R.drawable.pag)
                binding.fr.setBackgroundColor(Color.parseColor("#5E35B1"))
            }
            R.id.f -> {
                binding.imageView4.setImageResource(R.drawable.spha)
                binding.fr.setBackgroundColor(Color.parseColor("#070F40"))
            }
        }
        return super.onOptionsItemSelected(item)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu1, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }
}