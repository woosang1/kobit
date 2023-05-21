package com.example.usecase

import com.example.model.LikeCoinModel
import com.example.repository.InsertCoinModelByLocalRepository
import javax.inject.Inject

class InsertCoinModelByLocalUseCase@Inject constructor(
    private val insertCoinModelByLocalRepository: InsertCoinModelByLocalRepository
){
    fun insertData(likeCoinModel: LikeCoinModel) = insertCoinModelByLocalRepository.insertData(likeCoinModel)
}