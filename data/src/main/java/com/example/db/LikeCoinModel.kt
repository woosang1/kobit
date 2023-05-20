package com.example.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "likeCoin")
// TODO: 여기 모델링 해야됨.
data class LikeCoinModel(
    @PrimaryKey
    val title: String,
) : Serializable