package com.example.homework7_5and8_5

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {
     var retrofit = Retrofit.Builder().baseUrl("https://api.openweathermap.org/")
    .addConverterFactory(GsonConverterFactory.create()).build()

    var api = retrofit.create(WeatherApi::class.java)
}