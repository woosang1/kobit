package com.example.kobit

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.kobit.databinding.LayoutSearchBarBinding

class SearchBar(context: Context, attrs: AttributeSet?) : LinearLayout(context, attrs) {

    private lateinit var binding : LayoutSearchBarBinding

    init {
        setBinding()
    }

    private fun setBinding(){
        binding = LayoutSearchBarBinding.inflate(LayoutInflater.from(context), this, true)
    }
}