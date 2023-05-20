package com.example.kobit.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.kobit.R
import com.example.kobit.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint
import androidx.activity.viewModels
import com.example.kobit.main.market.MarketViewModel

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModels()

    enum class PageType(val tabTitle: String) {
        MARKET("마켓"),
        LIKE("즐겨찾기")
    }

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBinding()
        setPagerTab()
        setPager()
    }

    private fun setBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setPagerTab() {
        binding.tabLayout.apply {
            addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
                override fun onTabSelected(tab: TabLayout.Tab?) {
//                    tab?.customView?.findViewById<TextView>(R.id.tabText)
//                        ?.setTextColor(R.color.black)
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {
//                    tab?.customView?.findViewById<TextView>(R.id.tabText)
//                        ?.setTextColor(R.color.alpha_black)
                }

                override fun onTabReselected(tab: TabLayout.Tab?) {
                }
            })
        }
    }

    private fun setPager() {
        binding.tabViewPager.apply {
            offscreenPageLimit = 1
            adapter = MainPagerAdapter(
                fragmentActivity = this@MainActivity,
                mainViewModel = mainViewModel
            ).apply { setPages(PageType.values()) }
            TabLayoutMediator(binding.tabLayout, this) { tab, position ->
                tab.customView =
                    (layoutInflater.inflate(R.layout.layout_tab_item, null) as View).apply {
                        findViewById<TextView>(R.id.tabText).run {
                            text =
                                (binding.tabViewPager.adapter as MainPagerAdapter).getType(position).tabTitle
                        }
                    }
            }.attach()
        }
    }

}