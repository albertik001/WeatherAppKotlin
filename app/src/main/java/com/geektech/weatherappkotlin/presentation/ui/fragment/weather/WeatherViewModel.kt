package com.geektech.weatherappkotlin.presentation.ui.fragment.weather

import com.geektech.weatherappkotlin.base.BaseViewModel
import com.geektech.weatherappkotlin.domain.useCases.FetchWeatherUseCase
import com.geektech.weatherappkotlin.presentation.models.MainResponseUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val fetchWeatherUseCase: FetchWeatherUseCase
) : BaseViewModel() {
    private val _weatherState = mutableUiStateFlow<MainResponseUI>()
    var weatherState = _weatherState.asStateFlow()

    fun fetchWeather(city: String) =
        fetchWeatherUseCase(city).gatherRequest(_weatherState) { it.toUI() }
}