package com.example.homework7_5and8_5

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
 //   https://api.openweathermap.org/data/2.5/weather?q=London&appid=bdb2917eb8179d50d760b162dcdc2e24&units=metric
    @GET("data/2.5/weather")
    fun getWeather(
     @Query("q") city : String,
     @Query("appid") key : String ="bdb2917eb8179d50d760b162dcdc2e24"
     ,@Query("units") unit :String ="metric" )
    : Call<WeatherModel>
}