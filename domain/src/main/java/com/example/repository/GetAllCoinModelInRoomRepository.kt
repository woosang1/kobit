package com.example.repository

import com.example.model.LikeCoinModel

interface GetAllCoinModelInRoomRepository {
    fun getAllData() : ArrayList<LikeCoinModel>
}