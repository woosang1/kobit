package com.example.kobit.main.market

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kobit.componet.CoinInfoAdapter
import com.example.kobit.databinding.FragmentMarketBinding
import com.example.kobit.utils.extension.dpToPixel
import androidx.lifecycle.Observer
import com.example.kobit.MenuClick
import com.example.kobit.main.MainViewModel
import com.example.kobit.model.CoinInfoModel
import com.example.kobit.utils.ItemVerticalDecorator
import com.example.kobit.utils.extension.getNumber
import com.example.kobit.views.MenuClickListener
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MarketFragment(
    private val mainViewModel: MainViewModel
) : Fragment() {

    //    private val mainViewModel: MainViewModel by activityViewModels<MainViewModel>()
    private lateinit var binding: FragmentMarketBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setBinding()
        setRecyclerview()
        setListener()
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        getData()
        setObserve()
    }

    private fun setBinding() {
        binding = FragmentMarketBinding.inflate(layoutInflater)
    }

    private fun setRecyclerview() {
        binding.recyclerView.apply {
            adapter = CoinInfoAdapter(mainViewModel)
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            addItemDecoration(
                ItemVerticalDecorator(
                    topMargin = 0.dpToPixel(),
                    bottomMargin = 6.dpToPixel(),
                    startMargin = 0.dpToPixel(),
                    endMargin = 0.dpToPixel(),
                    firstTopMargin = 0.dpToPixel(),
                    lastBottomMargin = 0.dpToPixel()
                )
            )
        }
    }

    private fun setListener() {
        binding.infoTitleLayout.setClickListener(
            menuClickListener = object : MenuClickListener {
                override fun titleClick(value: Boolean) {
                    sortListByMenuClickType(menuClick = MenuClick.TITLE, value = value)
                }

                override fun priceClick(value: Boolean) {
                    sortListByMenuClickType(menuClick = MenuClick.PRICE, value = value)
                }

                override fun timeClick(value: Boolean) {
                    sortListByMenuClickType(menuClick = MenuClick.TIME, value = value)
                }

                override fun moneyClick(value: Boolean) {
                    sortListByMenuClickType(menuClick = MenuClick.MONEY, value = value)
                }
            }
        )
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun sortListByMenuClickType(menuClick: MenuClick, value: Boolean){
        if (binding.recyclerView.adapter is CoinInfoAdapter) {
            val adapter = (binding.recyclerView.adapter as CoinInfoAdapter)
            val modelList = adapter.getModelList()
            // 오름차순
            if (value) {
                when(menuClick){
                    MenuClick.TITLE -> modelList.sortBy { it.data.title }
                    MenuClick.PRICE -> modelList.sortBy { it.data.last.getNumber() }
                    MenuClick.TIME -> modelList.sortBy { it.data.changePercent.getNumber() }
                    MenuClick.MONEY -> modelList.sortBy { it.data.volume.getNumber() }
                }
            }
            // 내림차순
            else modelList.sortByDescending { it.data.title }
            adapter.notifyDataSetChanged()
        }
    }

    private fun getData() {
        mainViewModel.getMarketDetailAll()
    }

    private fun setObserve() {
        with(mainViewModel) {
            coinDataLiveData.observe(viewLifecycleOwner, Observer {
                if (binding.recyclerView.adapter is CoinInfoAdapter) {
                    addData(it as ArrayList<CoinInfoModel>)
                }
            })
        }
    }

    private fun addData(value: ArrayList<CoinInfoModel>) {
        (binding.recyclerView.adapter as CoinInfoAdapter).addData(value)
    }
}
