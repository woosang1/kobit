package com.example.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface LikeCoinDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(recentlyData: LikeCoinModel)

    @Query("DELETE FROM likeCoin")
    fun clear()

    @Query("SELECT * FROM likeCoin")
    fun selectAll(): List<LikeCoinModel>
}