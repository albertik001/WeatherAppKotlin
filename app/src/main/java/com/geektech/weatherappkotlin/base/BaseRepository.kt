package com.geektech.weatherappkotlin.base

import android.widget.Toast
import com.geektech.weatherappkotlin.common.resource.Resource
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

abstract class BaseRepository {

    protected fun <T> sendRequest(
        request: suspend () -> T,
        saveToDatabase: suspend (data: T) -> Unit
    ) = flow {
        emit(Resource.Loading())
        try {
            request()?.let {
                saveToDatabase(it)
                emit(Resource.Success(it))
            }
        } catch (e: IOException) {
            emit(
                Resource.Error(null, e.localizedMessage ?: "An error occurred ! ")
            )
        } catch (httpException: HttpException) {
            emit(
                Resource.Error(
                    null,
                    httpException.localizedMessage ?: "An HttpException occurred!"
                )
            )
        }
    }

    protected fun <T> sendRequest(request: suspend () -> T) = flow {

        emit(Resource.Loading())
        try {
            emit(Resource.Success(data = request()))
        } catch (e: IOException) {
            emit(
                Resource.Error(null, e.localizedMessage ?: "An error occurred!")
            )
        }
    }

}