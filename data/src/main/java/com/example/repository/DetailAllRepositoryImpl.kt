package com.example.repository

import android.util.Log
import com.example.model.CoinListModel
import com.example.model.mapperToConListModel
import com.example.model.rp.RpDetailAllModel
import com.example.network.NetworkManager
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class DetailAllRepositoryImpl @Inject constructor(
    private val networkManager: NetworkManager
) : DetailAllRepository {
    override fun getDetailAll(success: (CoinListModel) -> Unit, fail: (String) -> Unit) {
        Log.i("aa", "getDetailAll 호출.")
        networkManager.getDetailAll().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : DisposableSingleObserver<RpDetailAllModel>() {
                override fun onSuccess(result: RpDetailAllModel) {
                    val coinListModel = result.mapperToConListModel()
                    Log.i("aa", "result : ${result}")
                    success.invoke(coinListModel)
                }

                override fun onError(e: Throwable) {
                    Log.i("aa", "e: ${e.toString()}")
                    e.message?.let {
                        fail.invoke(it)
                    }
                }
            })
    }

}