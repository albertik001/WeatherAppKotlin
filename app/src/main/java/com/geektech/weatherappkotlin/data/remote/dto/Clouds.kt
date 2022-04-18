package com.geektech.weatherappkotlin.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Clouds(
    @SerializedName("all")
    val all: Int
)