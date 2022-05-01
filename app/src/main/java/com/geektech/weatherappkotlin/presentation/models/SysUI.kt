package com.geektech.weatherappkotlin.presentation.models

import com.geektech.weatherappkotlin.domain.models.SysModel

data class SysUI(
    val type: Int?,
    val id: Int?,
    val country: String?,
    val sunrise: Int?,
    val sunset: Int?
)
fun SysModel.toUI() = SysUI(type, id, country, sunrise, sunset)