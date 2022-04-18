package com.geektech.weatherappkotlin.presentation.ui.fragment.weather

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.geektech.weatherappkotlin.base.BaseViewModel
import com.geektech.weatherappkotlin.data.remote.dto.MainResponse
import com.geektech.weatherappkotlin.data.remote.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val mainRepository: MainRepository
) : BaseViewModel() {
    private val _weatherState = MutableLiveData<MainResponse>()
    var weatherState: LiveData<MainResponse> = _weatherState

    fun fetchWeather(city:String) = mainRepository.fetchWeather(city).gather(_weatherState)
}