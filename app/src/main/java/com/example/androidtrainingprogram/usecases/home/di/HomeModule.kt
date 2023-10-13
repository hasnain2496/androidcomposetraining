package com.example.androidtrainingprogram.usecases.home.di

import com.example.androidtrainingprogram.usecases.home.data.network.HomeAPI
import com.example.androidtrainingprogram.usecases.home.data.repository.HomeRepositoryImpl
import com.example.androidtrainingprogram.usecases.home.domain.repository.HomeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class HomeModule {

    @Provides
    @Singleton
    fun provideHomeAPI(retrofit: Retrofit): HomeAPI =
        retrofit.create(HomeAPI::class.java)

    @Singleton
    @Provides
    fun provideHomeRepository(
        homeAPI: HomeAPI
    ): HomeRepository =
        HomeRepositoryImpl(homeAPI)
}