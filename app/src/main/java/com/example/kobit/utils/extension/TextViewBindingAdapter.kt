package com.example.kobit.utils.extension

import android.util.TypedValue
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.BindingAdapter
import com.example.kobit.R
import com.example.kobit.application.KobitApplication

enum class FontStyle(val type : String){
    EXTRA_BOLD("EXTRA_BOLD"),
    BOLD("BOLD"),
    MEDIUM("MEDIUM"),
    REGULAR("REGULAR"),
}

@BindingAdapter("setFontStyle")
fun setFontStyle(fontTextView: TextView, type : String?) {
    if(type.isNullOrEmpty()) return
    when(type) {
        FontStyle.EXTRA_BOLD.type -> {
            fontTextView.apply {
                typeface = ResourcesCompat.getFont(KobitApplication.getGlobalContext(), R.font.extra_bold)
                setTextSize(TypedValue.COMPLEX_UNIT_DIP, 18F)
            }
        }

        FontStyle.BOLD.type -> {
            fontTextView.apply {
                typeface = ResourcesCompat.getFont(KobitApplication.getGlobalContext(), R.font.bold)
                setTextSize(TypedValue.COMPLEX_UNIT_DIP, 16F)
            }
        }

        FontStyle.MEDIUM.type -> {
            fontTextView.apply {
                typeface = ResourcesCompat.getFont(KobitApplication.getGlobalContext(), R.font.medium)
                setTextSize(TypedValue.COMPLEX_UNIT_DIP, 14F)
            }
        }
        FontStyle.REGULAR.type -> {
            fontTextView.apply {
                typeface = ResourcesCompat.getFont(KobitApplication.getGlobalContext(), R.font.regular)
                setTextSize(TypedValue.COMPLEX_UNIT_DIP, 12F)
            }
        }
    }
}