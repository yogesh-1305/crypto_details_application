package com.yscoding.cryptocurrencyappyt.domain.repository

import com.yscoding.cryptocurrencyappyt.data.remote.dto.CoinDTO
import com.yscoding.cryptocurrencyappyt.data.remote.dto.CoinDetailDTO

interface CoinRepository {

    suspend fun getCoins(): List<CoinDTO>

    suspend fun getCoinById(coinId: String): CoinDetailDTO
}