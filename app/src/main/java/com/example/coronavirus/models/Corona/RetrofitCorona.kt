package com.example.coronavirus.models.Corona

import com.example.coronavirus.adapters.CoronaInterface
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL ="https://api.stackexchange.com/2.2/"

class RetrofitCorona {
    val retrofitCountry : CoronaInterface by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return@lazy retrofit.create(CoronaInterface::class.java)
    }
}