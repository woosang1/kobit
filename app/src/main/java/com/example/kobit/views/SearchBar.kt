package com.example.kobit.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView.OnEditorActionListener
import com.example.kobit.databinding.LayoutSearchBarBinding


class SearchBar(context: Context, attrs: AttributeSet?) : LinearLayout(context, attrs) {

    private lateinit var binding : LayoutSearchBarBinding

    init {
        setBinding()
        setListener()
    }

    private fun setBinding(){
        binding = LayoutSearchBarBinding.inflate(LayoutInflater.from(context), this, true)
    }

    private fun setListener(){
        binding.rootLayout.setOnClickListener {
            binding.editText.requestFocus()
        }
        binding.editText.onFocusChangeListener = OnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                showKeyboard(context, binding.editText)
            } else {
                hideKeyboard(context, binding.editText)
            }
        }
    }

    fun setOnEditorActionListener(okClickEvent: () -> Unit){
        binding.editText.setOnEditorActionListener(OnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                okClickEvent.invoke()
                return@OnEditorActionListener true
            }
            false
        })
    }

    fun getText() : String = binding.editText.text.toString()

    // EditText에 포커스를 주기 위한 함수
    private fun showKeyboard(context: Context, editText: EditText) {
        editText.requestFocus()
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT)
    }

    // EditText의 포커스를 해제하기 위한 함수
    private fun hideKeyboard(context: Context, editText: EditText) {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(editText.windowToken, 0)
    }
}