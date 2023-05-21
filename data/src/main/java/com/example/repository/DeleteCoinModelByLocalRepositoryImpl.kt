package com.example.repository

import com.example.db.LikeCoinDao
import javax.inject.Inject

class DeleteCoinModelByLocalRepositoryImpl @Inject constructor(
    private val likeCoinDao: LikeCoinDao
) : DeleteCoinModelByLocalRepository {

    override fun deleteModel(title: String) {
        likeCoinDao.deleteItem(title)
    }

}