package com.example.kobit.main.market

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
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MarketFragment(
    private val mainViewModel: MainViewModel
) : Fragment() {

//    private val mainViewModel: MainViewModel by activityViewModels<MainViewModel>()
    private val marketViewModel: MarketViewModel by viewModels()

    private lateinit var binding: FragmentMarketBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setBinding()
        setRecyclerview()
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        getData()
        observe()
    }

    private fun setBinding(){
        binding = FragmentMarketBinding.inflate(layoutInflater)
    }

    private fun setRecyclerview(){
        binding.recyclerView.apply {
            adapter = CoinInfoAdapter()
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

    private fun getData(){
        mainViewModel.getMarketDetailAll()
    }

    private fun observe(){
        with(mainViewModel){
            coinDataLiveData.observe(viewLifecycleOwner, Observer {
                if (binding.recyclerView.adapter is CoinInfoAdapter){
                    (binding.recyclerView.adapter as CoinInfoAdapter).addData(it as ArrayList<CoinDataModel>)
                }
            })
        }
    }
}