package com.example.clothingstore.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.clothingstore.R
import com.example.clothingstore.adapters.ItemsAdapter
import com.example.clothingstore.components
import kotlinx.android.synthetic.main.fragment_shirts.*


class ShoesFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shoes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        addItems()
    }
    private fun addItems() {
        val items = ArrayList<components>()

        //add data
        items.add(components("Shoes 1", 200, R.drawable.item1_shose))
        items.add(components("Shoes 2", 500, R.drawable.item2_shose))
        items.add(components("Shoes 3", 620, R.drawable.item3_shose))
        items.add(components("Shoes 4", 899, R.drawable.item4_shose))
        items.add(components("Shoes 5", 411, R.drawable.item5_shose))
        items.add(components("Shoes 6", 203, R.drawable.item6_shose))
        items.add(components("Shoes 7", 100, R.drawable.item7_shose))
        items.add(components("Shoes 8", 960, R.drawable.item8_shose))
        items.add(components("Shoes 9", 80, R.drawable.item9_shose))
        items.add(components("Shoes 10", 152, R.drawable.item10_shose))


        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        val adapter = ItemsAdapter(items)
        recyclerView.adapter = adapter
    }
}