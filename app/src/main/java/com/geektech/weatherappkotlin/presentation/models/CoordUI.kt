package com.geektech.weatherappkotlin.presentation.models

import com.geektech.weatherappkotlin.domain.models.CoordModel

data class CoordUI(
    val lon: Double?,
    val lat: Double?
)

fun CoordModel.toUI() = CoordUI(lat, lon)
