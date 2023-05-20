package com.example.kobit.di

import android.content.Context
import com.example.db.DataBase
import com.example.db.LikeCoinDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DBModule {

    @Provides
    fun provideLikeCoinDao(@ApplicationContext context: Context): LikeCoinDao {
        return DataBase.getInstance(context).likeCoinDao()
    }
}