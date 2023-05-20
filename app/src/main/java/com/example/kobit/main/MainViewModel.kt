package com.example.kobit.main

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.usecase.MarketDetailUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val marketDetailUseCase: MarketDetailUseCase,
) : ViewModel() {

    fun getMarketDetailAll() {
        marketDetailUseCase.getDetailAll(
            success = {
                      Log.i("aa" , "vm getMarketDetailAll success - : ${it.toString()}")
            },
            fail = {
            }
        )
    }
}