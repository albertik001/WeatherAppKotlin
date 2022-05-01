package com.geektech.weatherappkotlin.domain.models


data class MainResponseModel(
    val coord: CoordModel?,
    val weather: List<WeatherModel>?,
    val base: String?,
    val main: MainModel?,
    val visibility: Int?,
    val wind: WindModel?,
    val cloudsDto: CloudsModel?,
    val dt: Int?,
    val sys: SysModel?,
    val timezone: Int?,
    val id: Int?,
    val name: String?,
    val cod: Int?
)