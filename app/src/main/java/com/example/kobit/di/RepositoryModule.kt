package com.example.kobit.di

import com.example.db.LikeCoinDao
import com.example.network.NetworkManager
import com.example.repository.DeleteCoinModelInRoomRepositoryImpl
import com.example.repository.DeleteCoinModelInRoomRepository
import com.example.repository.DetailAllRepository
import com.example.repository.DetailAllRepositoryImpl
import com.example.repository.GetAllCoinModelInRoomRepository
import com.example.repository.GetAllCoinModelInRoomRepositoryImpl
import com.example.repository.InsertCoinModelInRoomRepository
import com.example.repository.InsertCoinModelInRoomRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RepositoryModule {

    @Provides
    @Singleton
    fun provideDetailAllRepository(networkManager: NetworkManager) : DetailAllRepository = DetailAllRepositoryImpl(networkManager)

    @Provides
    @Singleton
    fun provideGetAllCoinModelInRoomRepository(likeCoinDao: LikeCoinDao) : GetAllCoinModelInRoomRepository = GetAllCoinModelInRoomRepositoryImpl(likeCoinDao)

    @Provides
    @Singleton
    fun provideInsertCoinModelInRoomRepository(likeCoinDao: LikeCoinDao) : InsertCoinModelInRoomRepository = InsertCoinModelInRoomRepositoryImpl(likeCoinDao)

    @Provides
    @Singleton
    fun provideDeleteCoinModelInRoomRepository(likeCoinDao: LikeCoinDao) : DeleteCoinModelInRoomRepository = DeleteCoinModelInRoomRepositoryImpl(likeCoinDao)
}