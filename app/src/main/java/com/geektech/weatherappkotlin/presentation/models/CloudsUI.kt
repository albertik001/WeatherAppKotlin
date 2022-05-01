package com.geektech.weatherappkotlin.presentation.models

import com.geektech.weatherappkotlin.domain.models.CloudsModel

data class CloudsUI(
    val all: Int?
)

fun CloudsModel.toUI() = CloudsUI(all)