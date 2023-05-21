package com.example.repository

import android.util.Log
import com.example.db.LikeCoinDao
import com.example.model.mappingLikeCoinModelList

class GetAllCoinModelInRoomRepositoryImpl(
    private val likeCoinDao: LikeCoinDao
) : GetAllCoinModelInRoomRepository {

    override fun getAllData(): ArrayList<com.example.model.LikeCoinModel> {
        val value = likeCoinDao.selectAll()
        return value.mappingLikeCoinModelList()
    }
}