package com.yscoding.cryptocurrencyappyt.presentation.coin_detail

import com.yscoding.cryptocurrencyappyt.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
