package com.example.kobit.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.kobit.databinding.LayoutInfoTitleBinding


class InfoTitleLayout(context: Context, attrs: AttributeSet?) : LinearLayout(context, attrs) {

    private lateinit var binding : LayoutInfoTitleBinding
    // 제목 오름차순
    private var isSortAscByTitle = true
    // 가격 오름차순
    private var isSortAscByPrice = true
    // 변동률 오름차순
    private var isSortAscByTime = true
    // 거래대금 오름차순
    private var isSortAscByMoney = true

    init {
        setBinding()
    }

    private fun setBinding(){
        binding = LayoutInfoTitleBinding.inflate(LayoutInflater.from(context), this, true)
    }

    fun setClickListener(menuClickListener: MenuClickListener){
        with(binding){
            titleMenu.setOnClickListener {
                isSortAscByTitle = !isSortAscByTitle
                menuClickListener.titleClick(isSortAscByTitle)
            }
            priceMenu.setOnClickListener {
                isSortAscByPrice = !isSortAscByPrice
                menuClickListener.priceClick(isSortAscByPrice)
            }
            timeMenu.setOnClickListener {
                isSortAscByTime = !isSortAscByTime
                menuClickListener.timeClick(isSortAscByTime)
            }
            moneyMenu.setOnClickListener {
                isSortAscByMoney = !isSortAscByMoney
                menuClickListener.moneyClick(isSortAscByMoney)
            }
        }
    }
}

interface MenuClickListener {
    fun titleClick(value: Boolean) {
        /* explicitly empty */
    }

    fun priceClick(value: Boolean) {
        /* explicitly empty */
    }
    fun timeClick(value: Boolean){

    }
    fun moneyClick(value: Boolean){

    }
}