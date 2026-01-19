package com.example.sunnyweather.logic.network

import com.example.sunnyweather.SunnyWeatherApplication
import com.example.sunnyweather.logic.model.PlaceResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {

    @GET("v2/place")
    suspend fun searchPlaces(
        @Query("query") query: String,
        @Query("token") token: String = SunnyWeatherApplication.TOKEN,
        @Query("lang") lang: String = "zh_CN"
    ): PlaceResponse

}