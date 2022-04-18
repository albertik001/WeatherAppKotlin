package com.geektech.weatherappkotlin.data.remote.apiservices

import com.geektech.weatherappkotlin.common.constants.Constants.WEATHER_FETCH
import com.geektech.weatherappkotlin.data.remote.dto.MainResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {

    @GET(WEATHER_FETCH)
    suspend fun fetchWeatherByCity(
        @Query("q") name: String,
        @Query("appid") id: String,
        @Query("units") units: String
    ): MainResponse

    @GET(WEATHER_FETCH)
    suspend fun fetchWeatherByMap(
        @Query("lat") lat: String,
        @Query("lon") lon: String,
        @Query("appid") id: String,
        @Query("units") units: String
    ): MainResponse

}