package com.example.coronavirus.adapters

import com.example.coronavirus.models.Corona.Country
import okhttp3.Call
import retrofit2.http.GET

interface CoronaInterface {
    @GET("https://api.quarantine.country/api/v1/summary/latest")
    suspend fun getCountry(): Call<List<Country>>
}