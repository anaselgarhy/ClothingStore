package com.example.clothingstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.clothingstore.adapters.ViewPagerAdapter
import com.example.clothingstore.fragments.JeansFragment
import com.example.clothingstore.fragments.ShirtsFragment
import com.example.clothingstore.fragments.ShoesFragment
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(ShirtsFragment(),"Shirts")
        adapter.addFragment(JeansFragment(), "Jeans")
        adapter.addFragment(ShoesFragment(), "Shoes")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
        
    }
}