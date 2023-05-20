package com.example.kobit.di

import com.example.repository.DetailAllRepositoryImpl
import com.example.usecase.MarketDetailUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideMarketDetailUseCase(repository: DetailAllRepositoryImpl) = MarketDetailUseCase(repository)

}
