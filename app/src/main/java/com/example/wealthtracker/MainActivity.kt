package com.example.wealthtracker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        val adapter = ViewPagerAdapter(this)
        viewPager.adapter = adapter

        val lastName = "Gvenetadze"
        val vowels = "aeiou"

        if (lastName.first().lowercaseChar() in vowels) {
            viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        } else {
            viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
        }

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> "Input"
                1 -> "Analytics"
                else -> "Profile"
            }
        }.attach()
    }
}