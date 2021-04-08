package com.example.clothingstore.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.clothingstore.components
import com.example.clothingstore.R
import com.example.clothingstore.adapters.ItemsAdapter
import kotlinx.android.synthetic.main.fragment_shirts.*


class ShirtsFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shirts, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        addItems()
    }

    private fun addItems() {
        val items = ArrayList<components>()

        //add data
        items.add(components("Shirt 1", 200, R.drawable.item1_shirt))
        items.add(components("Shirt 2", 500, R.drawable.item2_shirt))
        items.add(components("Shirt 3", 1000, R.drawable.item3_shirt))
        items.add(components("Shirt 4", 400, R.drawable.item4_shirt))
        items.add(components("Shirt 5", 150, R.drawable.item5_shirt))
        items.add(components("Shirt 6", 640, R.drawable.item6_shirt))
        items.add(components("Shirt 7", 230, R.drawable.item7_shirt))
        items.add(components("Shirt 8", 800, R.drawable.item8_shirt))
        items.add(components("Shirt 9", 720, R.drawable.item6_shirt))
        items.add(components("Shirt 10", 952, R.drawable.item4_shirt))

        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        val adapter = ItemsAdapter(items)
        recyclerView.adapter = adapter
    }
}