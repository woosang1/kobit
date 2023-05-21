package com.example.repository

import com.example.model.LikeCoinModel

interface InsertCoinModelByLocalRepository {
    fun insertData(likeCoinModel: LikeCoinModel)
}