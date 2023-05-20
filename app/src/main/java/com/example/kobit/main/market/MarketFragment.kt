package com.example.kobit.main.market

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kobit.componet.CoinInfoAdapter
import com.example.kobit.databinding.FragmentMarketBinding
import com.example.kobit.utils.ItemHorizontalDecorator
import com.example.kobit.utils.extension.dpToPixel
import androidx.lifecycle.Observer
import com.example.kobit.main.MainViewModel
import com.example.kobit.model.CoinDataModel
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

    private fun setBinding(){
        binding = FragmentMarketBinding.inflate(layoutInflater)
    }

    private fun setRecyclerview(){
        binding.recyclerView.apply {
            adapter = CoinInfoAdapter(mainViewModel)
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            addItemDecoration(
                ItemHorizontalDecorator(
                    topMargin = 0.dpToPixel(),
                    bottomMargin = 0.dpToPixel(),
                    startMargin = 0.dpToPixel(),
                    endMargin = 8.dpToPixel(),
                    firstStartMargin = 0.dpToPixel(),
                    lastEndMargin = 0.dpToPixel()
                )
            )
        }
    }

    private fun setListener(){
        binding.infoTitleLayout.setClickListener(
            menuClickListener = object : MenuClickListener {
                @SuppressLint("NotifyDataSetChanged")
                override fun titleClick(value: Boolean) {
                    if(binding.recyclerView.adapter is CoinInfoAdapter){
                        val adapter = (binding.recyclerView.adapter as CoinInfoAdapter)
                        val modelList = adapter.getModelList()
                        // 오름차순
                        if (value) modelList.sortBy { it.data.title }
                        // 내림차순
                        else modelList.sortByDescending { it.data.title }
                        adapter.notifyDataSetChanged()
                    }
                }

                @SuppressLint("NotifyDataSetChanged")
                override fun priceClick(value: Boolean) {
                    val adapter = (binding.recyclerView.adapter as CoinInfoAdapter)
                    val modelList = adapter.getModelList()
                    // 오름차순
                    if (value) modelList.sortBy { it.data.last.getNumber() }
                    // 내림차순
                    else modelList.sortByDescending { it.data.last.getNumber() }
                    adapter.notifyDataSetChanged()
                }

                @SuppressLint("NotifyDataSetChanged")
                override fun timeClick(value: Boolean) {
                    val adapter = (binding.recyclerView.adapter as CoinInfoAdapter)
                    val modelList = (binding.recyclerView.adapter as CoinInfoAdapter).getModelList()
                    // 오름차순
                    if (value) modelList.sortBy { it.data.changePercent.getNumber() }
                    // 내림차순
                    else modelList.sortByDescending { it.data.changePercent.getNumber() }
                    adapter.notifyDataSetChanged()
                }
                @SuppressLint("NotifyDataSetChanged")
                override fun moneyClick(value: Boolean) {
                    val adapter = (binding.recyclerView.adapter as CoinInfoAdapter)
                    val modelList = (binding.recyclerView.adapter as CoinInfoAdapter).getModelList()
                    // 오름차순
                    if (value) modelList.sortBy { it.data.volume.getNumber() }
                    // 내림차순
                    else modelList.sortByDescending { it.data.volume.getNumber() }
                    adapter.notifyDataSetChanged()
                }
            }
        )
    }

    private fun getData(){
        mainViewModel.getMarketDetailAll()
    }

    private fun setObserve(){
        with(mainViewModel){
            coinDataLiveData.observe(viewLifecycleOwner, Observer {
                if (binding.recyclerView.adapter is CoinInfoAdapter){
                    addData(it as ArrayList<CoinDataModel>)
                }
            })
        }
    }

    private fun addData(value : ArrayList<CoinDataModel>){
        (binding.recyclerView.adapter as CoinInfoAdapter).addData(value)
    }

}