package com.geektech.weatherappkotlin.data.remote.dtos


import com.geektech.weatherappkotlin.domain.models.MainResponseModel
import com.google.gson.annotations.SerializedName

data class MainResponseDto(
    @SerializedName("coord")
    val coord: CoordDto?,
    @SerializedName("weather")
    val weather: List<WeatherDto>?,
    @SerializedName("base")
    val base: String?,
    @SerializedName("main")
    val main: MainDto?,
    @SerializedName("visibility")
    val visibility: Int?,
    @SerializedName("wind")
    val wind: WindDto?,
    @SerializedName("cloudsDto")
    val cloudsDto: CloudsDto?,
    @SerializedName("dt")
    val dt: Int?,
    @SerializedName("sys")
    val sys: SysDto?,
    @SerializedName("timezone")
    val timezone: Int?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("cod")
    val cod: Int?
)

fun MainResponseDto.toDomain() =
    MainResponseModel(
        coord?.toDomain(),
        weather?.map { it.toDomain() },
        base,
        main?.toDomain(),
        visibility,
        wind?.toDomain(),
        cloudsDto?.toDomain(),
        dt,
        sys?.toDomain(),
        timezone,
        id,
        name,
        cod
    )