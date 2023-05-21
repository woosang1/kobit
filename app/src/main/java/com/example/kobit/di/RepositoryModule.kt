package com.example.kobit.di

import com.example.db.LikeCoinDao
import com.example.network.NetworkManager
import com.example.repository.DeleteCoinModelByLocalRepositoryImpl
import com.example.repository.DeleteCoinModelByLocalRepository
import com.example.repository.DetailAllRepository
import com.example.repository.DetailAllRepositoryImpl
import com.example.repository.GetAllCoinModelByLocalRepository
import com.example.repository.GetAllCoinModelByLocalRepositoryImpl
import com.example.repository.InsertCoinModelByLocalRepository
import com.example.repository.InsertCoinModelByLocalRepositoryImpl
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
    fun provideGetAllCoinModelInRoomRepository(likeCoinDao: LikeCoinDao) : GetAllCoinModelByLocalRepository = GetAllCoinModelByLocalRepositoryImpl(likeCoinDao)

    @Provides
    @Singleton
    fun provideInsertCoinModelInRoomRepository(likeCoinDao: LikeCoinDao) : InsertCoinModelByLocalRepository = InsertCoinModelByLocalRepositoryImpl(likeCoinDao)

    @Provides
    @Singleton
    fun provideDeleteCoinModelInRoomRepository(likeCoinDao: LikeCoinDao) : DeleteCoinModelByLocalRepository = DeleteCoinModelByLocalRepositoryImpl(likeCoinDao)
}