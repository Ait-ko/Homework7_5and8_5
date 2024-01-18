package com.example.homework7_5and8_5

data class WeatherModel(
    var main : MainModel,
    var wind : WindModel,
    var name : String
)
data class WindModel(
    var speed : Double
)
data class MainModel(
    var temp : Double,
    var feelslike : Double
)
