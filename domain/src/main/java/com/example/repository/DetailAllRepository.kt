package com.example.repository

interface DetailAllRepository {
    fun getDetailAll(success: () -> Unit, fail: (String) -> Unit)
}