package com.example.model.rp

import com.google.gson.annotations.SerializedName

data class RpDetailAllModel(
    @SerializedName("lastBuildDate")
    var lastBuildDate: String,
    @SerializedName("total")
    var total: Int,
    @SerializedName("start")
    var start: Int,
    @SerializedName("display")
    var display: Int
)