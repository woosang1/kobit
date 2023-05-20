package com.example.kobit.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kobit.model.CoinDataModel
import com.example.kobit.utils.extension.makeComma
import com.example.kobit.utils.extension.makePrice
import com.example.kobit.utils.extension.roundData
import com.example.model.CoinListModel
import com.example.usecase.MarketDetailUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val marketDetailUseCase: MarketDetailUseCase
) : ViewModel() {

    // 코인 정보 조회 성공
    private val _coinDataLiveData = MutableLiveData<java.util.ArrayList<CoinDataModel.MarketModel>>()
    val coinDataLiveData: LiveData<java.util.ArrayList<CoinDataModel.MarketModel>> = _coinDataLiveData

    fun getMarketDetailAll() {
        marketDetailUseCase.getDetailAll(
            success = {
                Log.i("aa" , "vm getMarketDetailAll success - : ${it.toString()}")
                _coinDataLiveData.postValue(makeMarketModel(it))
            },
            fail = {
            }
        )
    }

    private fun makeMarketModel(coinListModel: CoinListModel): ArrayList<CoinDataModel.MarketModel> {
        return ArrayList<CoinDataModel.MarketModel>().apply {
            coinListModel.dataList.forEach {
                add(
                    CoinDataModel.MarketModel(
                        data = CoinDataModel.Data(
                            title = it.title ?: "",
                            timestamp = it.timestamp ?: 0L,
                            last = it.last?.makePrice() ?: "",
                            open = it.open?.makeComma() ?: "",
                            bid = it.bid?.makeComma() ?: "",
                            ask = it.ask?.makeComma() ?: "",
                            low = it.low?.makeComma() ?: "",
                            high = it.high?.makeComma() ?: "",
                            volume = it.volume?.roundData() ?: "",
                            change = it.change?.makeComma() ?: "",
                            changePercent = it.changePercent ?: ""
                        )
                    )
                )
            }
        }
    }
}