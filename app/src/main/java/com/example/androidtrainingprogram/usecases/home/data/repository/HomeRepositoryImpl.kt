package com.example.androidtrainingprogram.usecases.home.data.repository

import com.example.androidtrainingprogram.usecases.home.data.model.GetProductsResponse
import com.example.androidtrainingprogram.usecases.home.data.network.HomeAPI
import com.example.androidtrainingprogram.usecases.home.domain.repository.HomeRepository
import javax.inject.Inject

class HomeRepositoryImpl @Inject constructor(private val homeAPI: HomeAPI) : HomeRepository {

    override suspend fun getProducts(): GetProductsResponse {
        return homeAPI.getProducts()
    }
}