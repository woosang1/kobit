package com.example.kobit

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter


class MainPagerAdapter (fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    private var models = ArrayList<MainActivity.PageType>()

    fun setPages(models: Array<MainActivity.PageType>) {
        this.models.addAll(models)
    }

    fun getType(position: Int) = models[position]

    override fun getItemCount(): Int = models.size

    override fun createFragment(position: Int): Fragment {
        return when (models[position]) {
            MainActivity.PageType.MARKET -> {
                return MarketFragment()
            }
            MainActivity.PageType.LIKE -> {
                return LikeFragment()
            }
        }
    }

}