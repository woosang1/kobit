package com.example.kobit.componet

import android.content.Context
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kobit.R
import com.example.kobit.application.KobitApplication
import com.example.kobit.databinding.LayoutCoinInfoBinding
import com.example.kobit.main.MainViewModel
import com.example.kobit.model.CoinDataModel


class CoinInfoViewHolder(
    private val context: Context,
    private val binding: LayoutCoinInfoBinding,
    private val mainViewModel: MainViewModel
) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(data: CoinDataModel.Data) {
        binding.data = data
        binding.isLike.setOnClickListener {
            data.isLike = !data.isLike
            changeLike(isLike = data.isLike, data = data)
        }
        binding.executePendingBindings()
    }

    private fun changeLike(isLike: Boolean, data: CoinDataModel.Data) {
        // 선택됨
        if (isLike) {
            mainViewModel.addModelToRoom(data)
            binding.isLike.setBackgroundResource(R.drawable.is_like_true)
            mainViewModel.callShowToast(KobitApplication.getGlobalContext().resources.getString(R.string.like_toast))
        }
        // 선택안됨.
        else {
            mainViewModel.deleteModelAndRefresh(data.title)
            binding.isLike.setBackgroundResource(R.drawable.is_like_false)
            mainViewModel.callShowToast(KobitApplication.getGlobalContext().resources.getString(R.string.like_cancel_toast))
        }
    }
}

@BindingAdapter("setText")
fun setText(textView: TextView, title: String) {
    textView.text = title
}

@BindingAdapter("setLikeBg")
fun setLikeBg(imageView: ImageView, value: Boolean) {
    if (value) {
        imageView.setBackgroundResource(R.drawable.is_like_true)
    }
    // 선택안됨.
    else {
        imageView.setBackgroundResource(R.drawable.is_like_false)
    }
}

@BindingAdapter("setTextWithPercent")
fun setTextWithPercent(textView: TextView, value: String) {
    textView.text = "${value}%"
}

@BindingAdapter("setColorByValue")
fun setColorByValue(textView: TextView, value: String) {
    val valueToDouble = value.toDoubleOrNull()
    valueToDouble?.let {
        if (it < 0) textView.setTextColor(
            ContextCompat.getColor(
                KobitApplication.getGlobalContext(),
                R.color.blue
            )
        )
        else if (it == 0.0) textView.setTextColor(
            ContextCompat.getColor(
                KobitApplication.getGlobalContext(),
                R.color.black
            )
        )
        else textView.setTextColor(
            ContextCompat.getColor(
                KobitApplication.getGlobalContext(),
                R.color.red
            )
        )
    }
}