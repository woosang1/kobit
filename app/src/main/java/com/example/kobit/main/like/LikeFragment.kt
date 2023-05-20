package com.example.kobit.main.like

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kobit.componet.CoinInfoAdapter
import com.example.kobit.databinding.FragmentLikeBinding
import com.example.kobit.main.MainViewModel
import com.example.kobit.model.CoinDataModel
import com.example.kobit.utils.ItemVerticalDecorator
import com.example.kobit.utils.extension.dpToPixel

class LikeFragment(
    private val mainViewModel: MainViewModel
) : Fragment() {

    private lateinit var binding: FragmentLikeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setBinding()
        setRecyclerview()
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        getData()
        setObserve()
    }

    private fun setBinding(){ binding = FragmentLikeBinding.inflate(layoutInflater) }

    private fun setRecyclerview(){
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

    private fun getData(){ mainViewModel.getModelToRoom() }

    private fun setObserve(){
        with(mainViewModel){
            coinDataByRoomLiveData.observe(viewLifecycleOwner, Observer {
                if (binding.recyclerView.adapter is CoinInfoAdapter){
                    (binding.recyclerView.adapter as CoinInfoAdapter).addData(it as ArrayList<CoinDataModel>)
                }
            })
        }
    }
}