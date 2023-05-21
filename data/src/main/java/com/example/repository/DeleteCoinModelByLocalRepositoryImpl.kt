package com.example.repository

import com.example.db.LikeCoinDao

class DeleteCoinModelByLocalRepositoryImpl(
    private val likeCoinDao: LikeCoinDao,
    ) : DeleteCoinModelByLocalRepository {

    override fun deleteModel(title: String) {
        likeCoinDao.deleteItem(title)
    }

}