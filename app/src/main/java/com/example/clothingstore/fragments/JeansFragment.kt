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


class JeansFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_jeans, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        addItems()
    }
    private fun addItems() {
        val items = ArrayList<components>()

        //add data
        items.add(components("Jeans 1", 102, R.drawable.item1_jeans))
        items.add(components("Jeans 2", 152, R.drawable.item2_jeans))
        items.add(components("Jeans 3", 180, R.drawable.item3_jeans))
        items.add(components("Jeans 4", 201, R.drawable.item4_jeans))
        items.add(components("Jeans 5", 142, R.drawable.item5_jeans))
        items.add(components("Jeans 6", 402, R.drawable.item6_jeans))
        items.add(components("Jeans 7", 321, R.drawable.item7_jeans))
        items.add(components("Jeans 8", 122, R.drawable.item8_jeans))
        items.add(components("Jeans 9", 141, R.drawable.item9_jeans))
        items.add(components("Jeans 10", 132, R.drawable.item10_jeans))

        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        val adapter = ItemsAdapter(items)
        recyclerView.adapter = adapter
    }
}