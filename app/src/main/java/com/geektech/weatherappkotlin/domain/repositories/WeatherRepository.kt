package com.geektech.weatherappkotlin.domain.repositories

import com.geektech.weatherappkotlin.domain.either.Either
import com.geektech.weatherappkotlin.domain.models.MainResponseModel
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {
    fun fetchWeather(city  :String): Flow<Either<String, MainResponseModel>>
}