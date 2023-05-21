package com.example.usecase

import com.example.repository.DeleteCoinModelByLocalRepository
import javax.inject.Inject

class DeleteCoinModelByLocalUseCase@Inject constructor(
    private val deleteCoinModelByLocalRepository: DeleteCoinModelByLocalRepository
){
    fun deleteModel(title: String) = deleteCoinModelByLocalRepository.deleteModel(title)
}