package com.example.repository

import com.example.model.LikeCoinModel

interface InsertCoinModelInRoomRepository {
    fun insertData(likeCoinModel: LikeCoinModel)
}