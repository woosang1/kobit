package com.example.usecase

import com.example.model.LikeCoinModel
import com.example.repository.GetAllCoinModelByLocalRepository
import javax.inject.Inject

class GetAllCoinModelByLocalUseCase@Inject constructor(
    private val getAllCoinModelByLocalRepository: GetAllCoinModelByLocalRepository
){
    fun getAllData() : ArrayList<LikeCoinModel> = getAllCoinModelByLocalRepository.getAllData()
}