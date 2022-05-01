package com.geektech.weatherappkotlin.data.remote.dtos


import com.geektech.weatherappkotlin.domain.models.SysModel
import com.google.gson.annotations.SerializedName

data class SysDto(
    @SerializedName("type")
    val type: Int?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("country")
    val country: String?,
    @SerializedName("sunrise")
    val sunrise: Int?,
    @SerializedName("sunset")
    val sunset: Int?
)
fun SysDto.toDomain() = SysModel(type, id, country, sunrise, sunset)