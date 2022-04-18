package com.geektech.weatherappkotlin.base

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.geektech.weatherappkotlin.common.resource.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

abstract class BaseViewModel : ViewModel() {

    protected fun <T> Flow<Resource<T>>.gather(
        state: MutableLiveData<T>,
        addition: (() -> Unit)? = null
    ) {
        viewModelScope.launch {
            collect {
                when (it) {
                    is Resource.Loading -> {
                        Log.e("TAG", "gather: Loading...")
                    }
                    is Resource.Error -> {
                        Log.e("gaypop", it.message.toString())
                    }
                    is Resource.Success -> {
                        addition?.let {
                            addition(

                            )
                        }
                        state.postValue(
                            it.data
                        )
                    }
                }
            }
        }
    }
}