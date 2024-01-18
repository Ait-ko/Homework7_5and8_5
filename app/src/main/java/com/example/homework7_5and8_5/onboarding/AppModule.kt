package com.example.homework7_5and8_5.onboarding

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import mbk.io.sabrina_hm4_5m.Hero
import mbk.io.sabrina_hm4_5m.model.LoveApi
import mbk.io.sabrina_hm4_5m.Pref
import mbk.io.sabrina_hm4_5m.Utils
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    fun providePref(sharedPreferences: SharedPreferences): Pref {
        return Pref(sharedPreferences)
    }
}