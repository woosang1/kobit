package com.example.model.rp


import com.google.gson.annotations.SerializedName

data class RpDetailModel(
    @SerializedName("ask")
    val ask: String,
    @SerializedName("bid")
    val bid: String,
    @SerializedName("change")
    val change: String,
    @SerializedName("changePercent")
    val changePercent: String,
    @SerializedName("high")
    val high: String,
    @SerializedName("last")
    val last: String,
    @SerializedName("low")
    val low: String,
    @SerializedName("open")
    val `open`: String,
    @SerializedName("timestamp")
    val timestamp: Long,
    @SerializedName("volume")
    val volume: String
)