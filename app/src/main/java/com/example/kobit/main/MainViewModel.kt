package com.example.kobit.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kobit.model.CoinInfoModel
import com.example.kobit.utils.extension.makeComma
import com.example.kobit.utils.extension.makePrice
import com.example.kobit.utils.extension.roundData
import com.example.model.CoinListModel
import com.example.repository.DeleteCoinModelByLocalRepository
import com.example.repository.GetAllCoinModelByLocalRepository
import com.example.repository.InsertCoinModelByLocalRepository
import com.example.usecase.DeleteCoinModelByLocalUseCase
import com.example.usecase.GetAllCoinModelByLocalUseCase
import com.example.usecase.InsertCoinModelByLocalUseCase
import com.example.usecase.MarketDetailUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val marketDetailUseCase: MarketDetailUseCase,
    private val getAllCoinModelByLocalUseCase: GetAllCoinModelByLocalUseCase,
    private val insertCoinModelByLocalUseCase: InsertCoinModelByLocalUseCase,
    private val deleteCoinModelByLocalUseCase: DeleteCoinModelByLocalUseCase
) : ViewModel() {

    // 코인 정보 조회 성공 (server)
    private val _coinDataLiveData = MutableLiveData<ArrayList<CoinInfoModel.MarketModel>>()
    val coinDataLiveData: LiveData<ArrayList<CoinInfoModel.MarketModel>> = _coinDataLiveData

    // 코인 정보 조회 성공 (room)
    private val _coinDataByLocalLiveData = MutableLiveData<ArrayList<CoinInfoModel.LikeModel>>()
    val coinDataByLocalLiveData: LiveData<ArrayList<CoinInfoModel.LikeModel>> = _coinDataByLocalLiveData

    private val _showToast = MutableLiveData<String>()
    val showToast: LiveData<String> = _showToast

    fun getMarketDetailAll() {
        marketDetailUseCase.getDetailAll(
            success = {
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
                _coinDataLiveData.postValue(makeMarketModel(it))
            },
            fail = {
                callShowToast(it)
            }
        )
    }

    fun callShowToast(value: String) {
        _showToast.postValue(value)
    }

    private fun makeMarketModel(coinListModel: CoinListModel): ArrayList<CoinInfoModel.MarketModel> {
        return ArrayList<CoinInfoModel.MarketModel>().apply {
            coinListModel.dataList.forEach {
                add(
                    CoinInfoModel.MarketModel(
                        data = CoinInfoModel.Data(
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

    fun addModelToRoom(data: CoinInfoModel.Data) {
        viewModelScope.launch(Dispatchers.IO) {
            insertCoinModelByLocalUseCase.insertData(
                com.example.model.LikeCoinModel(
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
            val likeCoinModelList = getAllCoinModelByLocalUseCase.getAllData()
            val coinDataModelList = makeCoinDataModelListToLikeCoinModelList(likeCoinModelList)
            _coinDataByLocalLiveData.postValue(coinDataModelList)
        }
    }

    fun deleteModelAndRefresh(title: String) {
        viewModelScope.launch(Dispatchers.IO) {
            deleteCoinModelByLocalUseCase.deleteModel(title)
            getModelToRoom()
        }
    }

    private fun makeCoinDataModelListToLikeCoinModelList(likeCoinModelList: ArrayList<com.example.model.LikeCoinModel>): ArrayList<CoinInfoModel.LikeModel> {
        return ArrayList<CoinInfoModel.LikeModel>().apply {
            likeCoinModelList.forEach {
                add(
                    CoinInfoModel.LikeModel(
                        data = CoinInfoModel.Data(
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