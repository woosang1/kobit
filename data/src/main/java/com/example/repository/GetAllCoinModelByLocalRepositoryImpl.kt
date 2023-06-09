package com.example.repository

import com.example.db.LikeCoinDao
import com.example.model.mappingLikeCoinModelList
import javax.inject.Inject

class GetAllCoinModelByLocalRepositoryImpl @Inject constructor(
    private val likeCoinDao: LikeCoinDao
) : GetAllCoinModelByLocalRepository {

    override fun getAllData(): ArrayList<com.example.model.LikeCoinModel> {
        val value = likeCoinDao.selectAll()
        return value.mappingLikeCoinModelList()
    }
}