package com.geektech.weatherappkotlin.di

import com.geektech.weatherappkotlin.data.remote.RetrofitClient
import com.geektech.weatherappkotlin.data.remote.apiservices.WeatherApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    private val retrofitClient = RetrofitClient()

    @Singleton
    @Provides
    fun provideWeatherApi(): WeatherApiService {
        return retrofitClient.provideWeatherApiService()
    }
}