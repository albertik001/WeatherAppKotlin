package com.geektech.weatherappkotlin.presentation.models

import com.geektech.weatherappkotlin.domain.models.WeatherModel

data class WeatherUI(
    val id: Int?,
    val main: String?,
    val description: String?,
    val icon: String?
)

fun WeatherModel.toUI() = WeatherUI(id, main, description, icon)
