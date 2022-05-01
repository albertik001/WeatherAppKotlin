package com.geektech.weatherappkotlin.presentation.models

import com.geektech.weatherappkotlin.domain.models.WindModel

data class WindUI(
    val speed: Double?,
    val deg: Int?,
    val gust: Double?
)

fun WindModel.toUI() = WindUI(speed, deg, gust)
