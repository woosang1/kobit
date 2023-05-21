package com.example.repository

import com.example.db.LikeCoinDao

class DeleteCoinModelInRoomRepositoryImpl(
    private val likeCoinDao: LikeCoinDao,
    ) : DeleteCoinModelInRoomRepository {

    override fun deleteModel(title: String) {
        likeCoinDao.deleteItem(title)
    }

}