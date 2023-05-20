package com.example.model

data class CoinListModel(
    val dataList : ArrayList<Item>
) {
    data class Item(
        val title: String?,
        val timestamp: Long?,
        val last : String?,
        val open: String?,
        val bid: String?,
        val ask: String?,
        val low: String?,
        val high: String?,
        val volume: String?,
        val change: String?,
        val changePercent: String?
    )
}