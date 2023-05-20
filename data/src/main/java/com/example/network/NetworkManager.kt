package com.example.network

import com.example.model.rp.RpDetailAllModel
import com.example.model.rp.RpDetailModel
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Provider

class NetworkManager @Inject constructor(
    private val retrofitClient: Provider<RetrofitClient>
) {

    fun getDetailAll(): Single<RpDetailAllModel> = retrofitClient.get().getVersionRetrofit(NetworkAPI::class.java).getDetailAll()
    fun getDetail(value: String): Single<RpDetailModel> = retrofitClient.get().getVersionRetrofit(NetworkAPI::class.java).getDetail(value)

}

