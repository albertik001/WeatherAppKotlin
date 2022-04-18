package com.geektech.weatherappkotlin.data.remote.repositories

import com.geektech.weatherappkotlin.base.BaseRepository
import com.geektech.weatherappkotlin.common.constants.Constants.API_KEY
import com.geektech.weatherappkotlin.common.constants.Constants.UNITS
import com.geektech.weatherappkotlin.data.remote.apiservices.WeatherApiService
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val weatherApiService: WeatherApiService
) : BaseRepository() {

    fun fetchWeather(city: String) = sendRequest {
        weatherApiService.fetchWeatherByCity(city, API_KEY, UNITS)
    }

    fun fetchWeather(lat: String, lon: String) = sendRequest {
        weatherApiService.fetchWeatherByMap(lat, lon, API_KEY, UNITS)
    }
}