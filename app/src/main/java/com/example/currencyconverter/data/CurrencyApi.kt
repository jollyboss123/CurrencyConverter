package com.example.currencyconverter.data

import com.example.currencyconverter.data.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

private const val ACCESS_KEY = "b55d18e234bbaca655670b56e9860bf4"

interface CurrencyApi {

    @GET("/latest")
    suspend fun getRates(
        @Query("access_key") access_key: String = ACCESS_KEY
    ): Response<CurrencyResponse>

}