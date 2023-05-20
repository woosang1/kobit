package com.example.kobit.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.db.LikeCoinDao
import com.example.db.LikeCoinModel
import com.example.kobit.model.CoinDataModel
import com.example.kobit.utils.extension.makeComma
import com.example.kobit.utils.extension.makePrice
import com.example.kobit.utils.extension.roundData
import com.example.model.CoinListModel
import com.example.usecase.MarketDetailUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val marketDetailUseCase: MarketDetailUseCase,
    private val likeCoinDao: LikeCoinDao,
) : ViewModel() {

    // 코인 정보 조회 성공 (server)
    private val _coinDataLiveData = MutableLiveData<ArrayList<CoinDataModel.MarketModel>>()
    val coinDataLiveData: LiveData<ArrayList<CoinDataModel.MarketModel>> = _coinDataLiveData

    // 코인 정보 조회 성공 (room)
    private val _coinDataByRoomLiveData = MutableLiveData<ArrayList<CoinDataModel.LikeModel>>()
    val coinDataByRoomLiveData: LiveData<ArrayList<CoinDataModel.LikeModel>> = _coinDataByRoomLiveData

    private val _showToast = MutableLiveData<String>()
    val showToast: LiveData<String> = _showToast

    fun getMarketDetailAll() {
        marketDetailUseCase.getDetailAll(
            success = {
                Log.i("aa", "vm getMarketDetailAll success - : ${it.toString()}")
                _coinDataLiveData.postValue(makeMarketModel(it))
            },
            fail = {
                callShowToast(it)
            }
        )
    }

    fun getMarketDetail(value: String) {
        marketDetailUseCase.getDetail(
            value = value,
            success = {
                Log.i("aa", "vm getMarketDetailAll success - : ${it.toString()}")
                _coinDataLiveData.postValue(makeMarketModel(it))
            },
            fail = {
                callShowToast(it)
            }
        )
    }

    fun callShowToast(value : String){
        _showToast.postValue(value)
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
                            change = it.change?.makePrice() ?: "",
                            changePercent = it.changePercent ?: ""
                        )
                    )
                )
            }
        }
    }

    fun addModelToRoom(data: CoinDataModel.Data) {
        viewModelScope.launch(Dispatchers.IO) {
            likeCoinDao.insert(
                LikeCoinModel(
                    title = data.title,
                    timestamp = data.timestamp,
                    last = data.last,
                    open = data.open,
                    bid = data.bid,
                    ask = data.ask,
                    low = data.low,
                    high = data.high,
                    volume = data.volume,
                    change = data.change,
                    changePercent = data.changePercent,
                    isLike = data.isLike
                )
            )
        }
    }

    fun getModelToRoom() {
        viewModelScope.launch(Dispatchers.IO) {
            val likeCoinModelList = likeCoinDao.selectAll()
            val coinDataModelList = makeCoinDataModelListToLikeCoinModelList(likeCoinModelList)
            _coinDataByRoomLiveData.postValue(coinDataModelList)
        }
    }

    fun deleteModelAndRefresh(title: String){
        viewModelScope.launch(Dispatchers.IO) {
            likeCoinDao.deleteItem(title)
            getModelToRoom()
        }
    }

    private fun makeCoinDataModelListToLikeCoinModelList(likeCoinModelList : List<LikeCoinModel>) : ArrayList<CoinDataModel.LikeModel> {
        return ArrayList<CoinDataModel.LikeModel>().apply {
            likeCoinModelList.forEach {
                add(
                    CoinDataModel.LikeModel(
                        data = CoinDataModel.Data(
                            title = it.title,
                            timestamp = it.timestamp,
                            last = it.last,
                            open = it.open,
                            bid = it.bid,
                            ask = it.ask,
                            low = it.low,
                            high = it.high,
                            volume = it.volume,
                            change = it.change,
                            changePercent = it.changePercent,
                            isLike = it.isLike
                        )
                    )
                )
            }
        }
    }


}