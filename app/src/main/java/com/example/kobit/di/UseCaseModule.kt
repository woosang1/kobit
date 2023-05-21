package com.example.kobit.di

import com.example.repository.DeleteCoinModelByLocalRepositoryImpl
import com.example.repository.DetailAllRepositoryImpl
import com.example.repository.GetAllCoinModelByLocalRepository
import com.example.repository.GetAllCoinModelByLocalRepositoryImpl
import com.example.repository.InsertCoinModelByLocalRepository
import com.example.repository.InsertCoinModelByLocalRepositoryImpl
import com.example.usecase.DeleteCoinModelByLocalUseCase
import com.example.usecase.GetAllCoinModelByLocalUseCase
import com.example.usecase.InsertCoinModelByLocalUseCase
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

    @Provides
    fun provideGetAllCoinModelByLocalUseCase(getAllCoinModelByLocalRepository: GetAllCoinModelByLocalRepositoryImpl) = GetAllCoinModelByLocalUseCase(getAllCoinModelByLocalRepository)

    @Provides
    fun provideInsertCoinModelByLocalUseCase(insertCoinModelByLocalRepository: InsertCoinModelByLocalRepositoryImpl) = InsertCoinModelByLocalUseCase(insertCoinModelByLocalRepository)

    @Provides
    fun provideDeleteCoinModelByLocalUseCase(deleteCoinModelByLocalRepository: DeleteCoinModelByLocalRepositoryImpl) = DeleteCoinModelByLocalUseCase(deleteCoinModelByLocalRepository)

}
