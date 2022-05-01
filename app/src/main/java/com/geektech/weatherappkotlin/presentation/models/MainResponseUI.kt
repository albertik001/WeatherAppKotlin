package com.geektech.weatherappkotlin.presentation.models

import com.geektech.weatherappkotlin.domain.models.MainResponseModel

data class MainResponseUI(
    val coord: CoordUI?,
    val weather: List<WeatherUI>?,
    val base: String?,
    val main: MainUI?,
    val visibility: Int?,
    val wind: WindUI?,
    val cloudsDto: CloudsUI?,
    val dt: Int?,
    val sys: SysUI?,
    val timezone: Int?,
    val id: Int?,
    val name: String?,
    val cod: Int?
)

fun MainResponseModel.toUI() = MainResponseUI(
    coord?.toUI(),
    weather?.map { it.toUI() },
    base,
    main?.toUI(),
    visibility,
    wind?.toUI(),
    cloudsDto?.toUI(),
    dt,
    sys?.toUI(),
    timezone,
    id,
    name,
    cod
)
