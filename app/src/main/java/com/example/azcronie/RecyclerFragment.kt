package com.example.azcronie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.azcronie.databinding.FragmentRecyclerBinding


class RecyclerFragment : Fragment(R.layout.fragment_recycler) {
    private lateinit var binding: FragmentRecyclerBinding
    private lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRecyclerBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()

        val array = ArrayList<ItemModel>()
        array.add(ItemModel("سبحان الله"))
        array.add(ItemModel("الحمد لله"))
        array.add(ItemModel("لا اله الا الله"))
        array.add(ItemModel("الله اكبر"))
        array.add(ItemModel("استغفر الله العظيم"))
        array.add(ItemModel("لا حول ولا قوة الا بالله"))
        array.add(ItemModel("سبحان الله بحمده سبحان الله العظيم"))
        array.add(ItemModel("لا اله الا انت سبحانك اني كنت من الظالمين"))
        array.add(ItemModel("اللهم صلي ع سيدنا محمد(ص)"))

        val adapter = Adapter(array)

        binding.recycler.layoutManager = LinearLayoutManager(requireContext())
        binding.recycler.adapter = adapter
    }
}
