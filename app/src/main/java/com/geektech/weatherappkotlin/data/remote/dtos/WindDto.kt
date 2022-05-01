package com.geektech.weatherappkotlin.data.remote.dtos


import com.geektech.weatherappkotlin.domain.models.WindModel
import com.google.gson.annotations.SerializedName

data class WindDto(
    @SerializedName("speed")
    val speed: Double?,
    @SerializedName("deg")
    val deg: Int?,
    @SerializedName("gust")
    val gust: Double?
)
fun WindDto.toDomain() = WindModel(speed, deg, gust)