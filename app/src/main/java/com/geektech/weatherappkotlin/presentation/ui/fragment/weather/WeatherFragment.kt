package com.geektech.weatherappkotlin.presentation.ui.fragment.weather

import android.annotation.SuppressLint
import android.util.Log
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import by.kirich1409.viewbindingdelegate.viewBinding
import com.geektech.weatherappkotlin.R
import com.geektech.weatherappkotlin.base.BaseFragment
import com.geektech.weatherappkotlin.common.extensions.isInternetAvailable
import com.geektech.weatherappkotlin.common.extensions.loadWithGlide
import com.geektech.weatherappkotlin.data.remote.dto.MainResponse
import com.geektech.weatherappkotlin.databinding.FragmentWeatherBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.*

@AndroidEntryPoint
class WeatherFragment :
    BaseFragment<FragmentWeatherBinding, WeatherViewModel>(R.layout.fragment_weather) {
    override val binding by viewBinding(FragmentWeatherBinding::bind)
    override val viewModel: WeatherViewModel by viewModels()


    override fun sendRequest() {
        viewModel.fetchWeather("Bishkek")
    }

    override fun initObservers() {
        if (isInternetAvailable(requireContext())) {
            lifecycleScope.launch {
                viewModel.weatherState.observe(viewLifecycleOwner) {
                    networkBind(it)
                }
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun networkBind(mainResponse: MainResponse) {
        //FORMAT DATA
        val mBarFormat =
            NumberFormat.getNumberInstance(Locale.US).format(mainResponse.main.pressure)
        val simpleDateFormat = SimpleDateFormat("HH:mm a", Locale.ROOT)
        val simpleDateFormats = SimpleDateFormat("HH:mm 'PM'", Locale.ROOT)
        val dayTime = SimpleDateFormat("HH'h' m'm'", Locale.ROOT)
        val realTimeFormat = SimpleDateFormat("EEEE, dd MMMM y | HH:mm a", Locale.ROOT)
        val realTime = realTimeFormat.format(System.currentTimeMillis()).toString()
        val timeSunrise = simpleDateFormat.format(mainResponse.sys.sunrise).toString()
        val timeSunset = simpleDateFormats.format(mainResponse.sys.sunset).toString()
        val timeDaytime = dayTime.format(mainResponse.dt).toString()
        val urlImg = "https://openweathermap.org/img/wn/" + mainResponse.weather[0].icon + ".png"
        //END
        binding.apply {
            statusImage.loadWithGlide(urlImg)
            nameCountry.text = mainResponse.sys.country + "," + mainResponse.name
            bigTemperature.text = mainResponse.main.temp.toString()
            percentHumidity.text = mainResponse.main.humidity.toString() + "%"
            mBarNumber.text = mBarFormat + "mBar"
            kmh.text = mainResponse.wind.speed.toString() + "km/h"
            timesSunrise.text = timeSunrise
            timesSunset.text = timeSunset
            timesDaytime.text = timeDaytime
            smallTemperature.text = mainResponse.main.tempMax.toString()
            smallTemperatureBottom.text = mainResponse.main.tempMin.toString()
            textTime.text = realTime

        }
    }

    override fun initListeners() {
    }
}