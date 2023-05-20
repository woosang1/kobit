package com.example.kobit.componet

import android.content.Context
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kobit.databinding.LayoutCoinInfoBinding
import com.example.kobit.model.CoinDataModel


class CoinInfoViewHolder(
    private val context: Context,
    private val binding: LayoutCoinInfoBinding,
) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(data: CoinDataModel.Data) {
        binding.data = data
        binding.isLike.setOnClickListener {
            data.isLike = !data.isLike
            changeLike(data.isLike)
        }
    }

    private fun changeLike(isLike: Boolean){
        // 선택됨
        if (isLike){

        }
        // 선택안됨.
        else{

        }
    }
}

@BindingAdapter("setText")
fun setText(textView: TextView, title: String) {
    textView.text = title
}