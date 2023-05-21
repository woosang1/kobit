package com.example.kobit.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.kobit.R
import com.example.kobit.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint
import androidx.activity.viewModels
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import com.example.kobit.utils.extension.FontStyle
import com.example.kobit.utils.extension.setFontStyle

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    enum class PageType(val tabTitle: String) {
        MARKET("마켓"),
        LIKE("즐겨찾기")
    }

    private val mainViewModel: MainViewModel by viewModels()

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBinding()
        setSearchBar()
        setPagerTab()
        setPager()
        setObserve()
    }

    private fun setBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setSearchBar() {
        binding.searchBar.setOnEditorActionListener {
            val keyword = binding.searchBar.getText()
            if (keyword.isEmpty() || keyword.isBlank()) {
                mainViewModel.getMarketDetailAll()
            } else {
                mainViewModel.getMarketDetail(keyword)
            }
        }
    }

    private fun setPagerTab() {
        binding.tabLayout.apply {
            addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
                override fun onTabSelected(tab: TabLayout.Tab?) {
                    tab?.let {
                        tab.customView?.findViewById<TextView>(R.id.tabText)?.apply {
                            setTextColor(
                                ContextCompat.getColor(
                                    this@MainActivity,
                                    R.color.black
                                )
                            )
                            setFontStyle(this, FontStyle.EXTRA_BOLD.type)
                        }
                        if (tab.position == PageType.LIKE.ordinal){
                            mainViewModel.getModelToRoom()
                        }
                    }
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {
                    tab?.customView?.findViewById<TextView>(R.id.tabText)?.apply {
                        setTextColor(
                            ContextCompat.getColor(
                                this@MainActivity,
                                R.color.gray
                            )
                        )
                        setFontStyle(this, FontStyle.BOLD.type)
                    }
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

    private fun setObserve() {
        with(mainViewModel) {
            showToast.observe(this@MainActivity, Observer {
                Toast.makeText(this@MainActivity, it, Toast.LENGTH_SHORT).show()
            })
        }
    }

}