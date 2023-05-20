package com.example.network

import com.example.model.rp.RpDetailAllModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface NetworkAPI {
    /**
     * 모든 시장 현황 상세 정보
     */
    @GET("ticker/detailed/all")
    fun getDetailAll(
    ): Single<RpDetailAllModel>

    /**
     * 해당 코인 상세 정보
     */
    @GET("ticker/detailed")
    fun getDetail(
        @Query("currency_pair") currencyPair: String,
    ): Single<RpDetailAllModel>
}
