package com.example.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "likeCoin")
data class LikeCoinModel(
    @PrimaryKey
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