package com.example.kobit.views

import android.R
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView.OnEditorActionListener
import androidx.core.content.ContextCompat.getSystemService
import com.example.kobit.databinding.LayoutSearchBarBinding


class SearchBar(context: Context, attrs: AttributeSet?) : LinearLayout(context, attrs) {

    private lateinit var binding : LayoutSearchBarBinding

    init {
        setBinding()
    }

    private fun setBinding(){
        binding = LayoutSearchBarBinding.inflate(LayoutInflater.from(context), this, true)
    }

    fun setListener(okClickEvent: () -> Unit){
        binding.editText.setOnEditorActionListener(OnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                okClickEvent.invoke()
                return@OnEditorActionListener true
            }
            false
        })
    }

    fun getText() : String = binding.editText.text.toString()
}