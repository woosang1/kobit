package com.example.model

import java.io.Serializable

data class LikeCoinModel(
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
) : Serializable