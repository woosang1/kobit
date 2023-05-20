package com.example.kobit.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.kobit.databinding.LayoutInfoTitleBinding


class InfoTitleLayout(context: Context, attrs: AttributeSet?) : LinearLayout(context, attrs) {

    private lateinit var binding : LayoutInfoTitleBinding

    init {
        setBinding()
    }

    private fun setBinding(){
        binding = LayoutInfoTitleBinding.inflate(LayoutInflater.from(context), this, true)
    }
}