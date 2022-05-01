package com.geektech.weatherappkotlin.data.remote.dtos


import com.geektech.weatherappkotlin.domain.models.MainModel
import com.google.gson.annotations.SerializedName

data class MainDto(
    @SerializedName("temp")
    val temp: Double?,
    @SerializedName("feels_like")
    val feelsLike: Double?,
    @SerializedName("temp_min")
    val tempMin: Double?,
    @SerializedName("temp_max")
    val tempMax: Double?,
    @SerializedName("pressure")
    val pressure: Int?,
    @SerializedName("humidity")
    val humidity: Int?,
    @SerializedName("sea_level")
    val seaLevel: Int?,
    @SerializedName("grnd_level")
    val grndLevel: Int?
)

fun MainDto.toDomain() =
    MainModel(temp, feelsLike, tempMin, tempMax, pressure, humidity, seaLevel, grndLevel)