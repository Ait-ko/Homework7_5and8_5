package com.example.homework7_5and8_5

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework7_5and8_5.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Response
import retrofit2.Callback

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
binding.BtnSearch.setOnClickListener {
    RetrofitService().api.getWeather(binding.cityEd.text.toString()).enqueue(object : Callback<WeatherModel> {
    @SuppressLint("SetTextI18n")
    override fun onResponse(
        call: Call<WeatherModel>,
        response: Response<WeatherModel>
    ) {
        if (response.isSuccessful) {
            response.body()?.let {
                binding.resultTV.text =
                    "City: ${it.name}\n\nTemp: ${it.main.temp}°C\n\nFeels like: ${it.main.feelslike}°C"
            }
        }
    }

    override fun onFailure(call: Call<WeatherModel>, t: Throwable) {

    }



}) }


}
}
