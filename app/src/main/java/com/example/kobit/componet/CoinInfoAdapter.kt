package com.example.kobit.componet

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kobit.databinding.LayoutCoinInfoBinding
import com.example.kobit.model.CoinDataModel

class CoinInfoAdapter : RecyclerView.Adapter<CoinInfoViewHolder>() {

//    private var modelList = java.util.ArrayList<CoinDataModel.Data>()
    private var modelList = ArrayList<CoinDataModel>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinInfoViewHolder {
        return CoinInfoViewHolder(
            context = parent.context,
            binding = LayoutCoinInfoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CoinInfoViewHolder, position: Int) {
        holder.onBind(modelList[position].data)
    }

    override fun getItemCount(): Int {
        return modelList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addData(items: ArrayList<CoinDataModel>) {
        modelList.clear()
        modelList.addAll(items)
        notifyDataSetChanged()
    }

}