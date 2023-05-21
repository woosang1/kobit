package com.example.repository

import com.example.model.LikeCoinModel

interface GetAllCoinModelByLocalRepository {
    fun getAllData() : ArrayList<LikeCoinModel>
}