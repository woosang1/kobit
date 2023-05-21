package com.example.kobit.model

sealed class CoinInfoModel {
    abstract val data: Data

    data class MarketModel(
        override val data: Data
    ) : CoinInfoModel()

    data class LikeModel(
        override val data: Data
    ) : CoinInfoModel()

    data class Data(
        val title: String,
        val timestamp: Long,
        val last : String,
        val open: String,
        val bid: String,
        val ask: String,
        val low: String,
        val high: String,
        val volume: String,
        val change: String,
        val changePercent: String,
        var isLike: Boolean = false
    )
}