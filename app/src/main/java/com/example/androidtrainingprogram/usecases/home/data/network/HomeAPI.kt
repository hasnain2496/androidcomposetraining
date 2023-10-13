package com.example.androidtrainingprogram.usecases.home.data.network

import com.example.androidtrainingprogram.usecases.home.data.model.GetProductsResponse
import retrofit2.http.GET

interface HomeAPI {

    @GET("products")
    suspend fun getProducts(): GetProductsResponse
}