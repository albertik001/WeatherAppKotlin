package com.geektech.weatherappkotlin.domain.useCases

import com.geektech.weatherappkotlin.domain.repositories.WeatherRepository
import javax.inject.Inject

class FetchWeatherUseCase @Inject constructor(
    private val weatherRepository: WeatherRepository
) {
    operator fun invoke(city: String) = weatherRepository.fetchWeather(city)
}