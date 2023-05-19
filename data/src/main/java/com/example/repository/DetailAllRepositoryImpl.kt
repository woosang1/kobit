package com.example.repository

import android.util.Log
import com.example.model.rp.RpDetailAllModel
import com.example.network.NetworkManager
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class DetailAllRepositoryImpl @Inject constructor(
    private val networkManager: NetworkManager
) : DetailAllRepository {
    override fun getDetailAll(success: () -> Unit, fail: (String) -> Unit) {
        networkManager.getDetailAll().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : DisposableSingleObserver<RpDetailAllModel>() {
                override fun onSuccess(result: RpDetailAllModel) {
                    Log.i("aa", "result : ${result}")
//                    success.invoke(result.mapper())
                }

                override fun onError(e: Throwable) {
                    e.message?.let {
                        fail.invoke(it)
                    }
                }
            })
    }

}