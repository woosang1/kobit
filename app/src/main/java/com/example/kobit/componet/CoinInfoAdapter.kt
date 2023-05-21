package com.example.kobit.componet

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kobit.databinding.LayoutCoinInfoBinding
import com.example.kobit.main.MainViewModel
import com.example.kobit.model.CoinInfoModel

class CoinInfoAdapter(
    private val mainViewModel: MainViewModel
) : RecyclerView.Adapter<CoinInfoViewHolder>() {

    private var modelList = ArrayList<CoinInfoModel>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinInfoViewHolder {
        return CoinInfoViewHolder(
            context = parent.context,
            binding = LayoutCoinInfoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            mainViewModel = mainViewModel
        )
    }

    override fun onBindViewHolder(holder: CoinInfoViewHolder, position: Int) {
        holder.onBind(modelList[position].data)
    }

    override fun getItemCount(): Int {
        return modelList.size
    }

    fun getModelList() : ArrayList<CoinInfoModel> = modelList

    @SuppressLint("NotifyDataSetChanged")
    fun addData(items: ArrayList<CoinInfoModel>) {
        modelList.clear()
        modelList.addAll(items)
        notifyDataSetChanged()
    }

}