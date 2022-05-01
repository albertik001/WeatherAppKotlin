package com.geektech.weatherappkotlin.data.remote.dtos


import com.geektech.weatherappkotlin.domain.models.WeatherModel
import com.google.gson.annotations.SerializedName

data class WeatherDto(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("main")
    val main: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("icon")
    val icon: String?
)
fun WeatherDto.toDomain() = WeatherModel(id, main, description, icon)