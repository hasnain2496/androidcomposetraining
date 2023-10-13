package com.example.androidtrainingprogram.usecases.home.domain.repository

import com.example.androidtrainingprogram.usecases.home.data.model.GetProductsResponse

interface HomeRepository {
    suspend fun getProducts(): GetProductsResponse
}