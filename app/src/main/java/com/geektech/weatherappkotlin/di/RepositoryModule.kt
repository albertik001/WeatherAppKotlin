package com.geektech.weatherappkotlin.di

import com.geektech.weatherappkotlin.data.remote.repositories.WeatherRepositoryImpl
import com.geektech.weatherappkotlin.domain.repositories.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindWeatherRepository(weatherRepositoryImpl: WeatherRepositoryImpl): WeatherRepository
}