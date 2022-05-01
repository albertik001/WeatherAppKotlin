package com.geektech.weatherappkotlin.data.remote.dtos


import com.geektech.weatherappkotlin.domain.models.CoordModel
import com.google.gson.annotations.SerializedName

data class CoordDto(
    @SerializedName("lon")
    val lon: Double?,
    @SerializedName("lat")
    val lat: Double?
)

fun CoordDto.toDomain() = CoordModel(lon, lat)