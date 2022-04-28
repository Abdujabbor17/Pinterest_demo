package com.masterandroid.pinterest_demo.model.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.masterandroid.pinterest_demo.model.fragmentsall.HomeFragment
import com.masterandroid.pinterest_demo.model.fragmentsall.MessageFragment
import com.masterandroid.pinterest_demo.model.fragmentsall.ProfileFragment
import com.masterandroid.pinterest_demo.model.fragmentsall.SearchFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {

            0 -> {
                HomeFragment()
            }
            1 -> {
                SearchFragment()
            }
            2 -> {
                MessageFragment()
            }
            3 -> {
                ProfileFragment()
            }
            else -> {
                Fragment()
            }
        }
    }
}
