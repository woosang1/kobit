package com.example.network

import com.example.model.rp.RpDetailAllModel
import io.reactivex.Single
import retrofit2.http.GET

interface NetworkAPI {
    /**
     * 모든 시장 현황 상세 정보
     */
    @GET("ticker/detailed/all")
    fun getDetailAll(
    ): Single<RpDetailAllModel>
}
