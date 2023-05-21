package com.example.repository

import com.example.db.LikeCoinDao
import com.example.db.LikeCoinModel

class InsertCoinModelInRoomRepositoryImpl(
    private val likeCoinDao: LikeCoinDao,
    ) : InsertCoinModelInRoomRepository {

    override fun insertData(data: com.example.model.LikeCoinModel) {
        likeCoinDao.insert(
            LikeCoinModel(
                title = data.title,
                timestamp = data.timestamp,
                last = data.last,
                open = data.open,
                bid = data.bid,
                ask = data.ask,
                low = data.low,
                high = data.high,
                volume = data.volume,
                change = data.change,
                changePercent = data.changePercent,
                isLike = data.isLike
            )
        )
    }

}