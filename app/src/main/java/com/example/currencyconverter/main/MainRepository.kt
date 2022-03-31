package com.example.currencyconverter.main

import com.example.currencyconverter.data.models.CurrencyResponse
import com.example.currencyconverter.util.Resource

/**
 * easier to test view models with interface, fake repo can just inherit this interface
 */
interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>
}