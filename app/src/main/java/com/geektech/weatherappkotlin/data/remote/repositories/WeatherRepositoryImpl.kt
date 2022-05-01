package com.geektech.weatherappkotlin.data.remote.repositories

import com.geektech.weatherappkotlin.base.BaseRepository
import com.geektech.weatherappkotlin.common.constants.Constants.API_KEY
import com.geektech.weatherappkotlin.common.constants.Constants.UNITS
import com.geektech.weatherappkotlin.data.remote.apiservices.WeatherApiService
import com.geektech.weatherappkotlin.data.remote.dtos.toDomain
import com.geektech.weatherappkotlin.domain.repositories.WeatherRepository
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val weatherApiService: WeatherApiService
) : BaseRepository(), WeatherRepository {

    override fun fetchWeather(city: String) = sendRequest {
        weatherApiService.fetchWeatherByCity(city, API_KEY, UNITS).toDomain()
    }

    fun fetchWeather(lat: String, lon: String) = sendRequest {
        weatherApiService.fetchWeatherByMap(lat, lon, API_KEY, UNITS)
    }

}