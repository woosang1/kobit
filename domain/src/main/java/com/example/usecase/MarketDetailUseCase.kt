package com.example.usecase

import com.example.model.CoinListModel
import com.example.repository.DetailAllRepository
import javax.inject.Inject

class MarketDetailUseCase @Inject constructor(
    private val repository: DetailAllRepository
) {

    fun getDetailAll(
        success: (CoinListModel) -> Unit, fail: (String) -> Unit
    ) {
        repository.getDetailAll(
            success = success,
            fail = fail
        )
    }
}