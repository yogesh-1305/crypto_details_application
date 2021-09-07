package com.yscoding.cryptocurrencyappyt.data.remote

import com.yscoding.cryptocurrencyappyt.data.remote.dto.CoinDTO
import com.yscoding.cryptocurrencyappyt.data.remote.dto.CoinDetailDTO
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDTO>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinID: String): CoinDetailDTO

}