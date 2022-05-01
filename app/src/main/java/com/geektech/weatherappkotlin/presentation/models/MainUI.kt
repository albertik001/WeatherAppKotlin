package com.geektech.weatherappkotlin.presentation.models

import com.geektech.weatherappkotlin.domain.models.MainModel

data class MainUI(
    val temp: Double?,
    val feelsLike: Double?,
    val tempMin: Double?,
    val tempMax: Double?,
    val pressure: Int?,
    val humidity: Int?,
    val seaLevel: Int?,
    val grndLevel: Int?
)

fun MainModel.toUI() =
    MainUI(temp, feelsLike, tempMin, tempMax, pressure, humidity, seaLevel, grndLevel)