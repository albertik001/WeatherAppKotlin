package com.geektech.weatherappkotlin.data.remote.apiservices

import com.geektech.weatherappkotlin.data.remote.dtos.MainResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {

    @GET("/data/2.5/weather")
    suspend fun fetchWeatherByCity(
        @Query("q") name: String,
        @Query("appid") id: String,
        @Query("units") units: String
    ): MainResponseDto

    @GET("/data/2.5/weather")
    suspend fun fetchWeatherByMap(
        @Query("lat") lat: String,
        @Query("lon") lon: String,
        @Query("appid") id: String,
        @Query("units") units: String
    ): MainResponseDto


}