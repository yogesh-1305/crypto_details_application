package com.yscoding.cryptocurrencyappyt.data.repositories

import com.yscoding.cryptocurrencyappyt.data.remote.CoinPaprikaApi
import com.yscoding.cryptocurrencyappyt.data.remote.dto.CoinDTO
import com.yscoding.cryptocurrencyappyt.data.remote.dto.CoinDetailDTO
import com.yscoding.cryptocurrencyappyt.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {

    override suspend fun getCoins(): List<CoinDTO> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDTO {
        return api.getCoinById(coinID = coinId)
    }
}