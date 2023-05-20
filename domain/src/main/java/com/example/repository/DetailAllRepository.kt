package com.example.repository

import com.example.model.CoinListModel

interface DetailAllRepository {
    fun getDetailAll(success: (CoinListModel) -> Unit, fail: (String) -> Unit)

    fun getDetail(value: String, success: (CoinListModel) -> Unit, fail: (String) -> Unit)
}