package com.example.kobit.di

import com.example.network.NetworkManager
import com.example.repository.DetailAllRepository
import com.example.repository.DetailAllRepositoryImpl
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

}