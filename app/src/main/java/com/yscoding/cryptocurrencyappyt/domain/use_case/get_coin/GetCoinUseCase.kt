package com.yscoding.cryptocurrencyappyt.domain.use_case.get_coin

import com.yscoding.cryptocurrencyappyt.common.Resource
import com.yscoding.cryptocurrencyappyt.data.remote.dto.toCoinDetail
import com.yscoding.cryptocurrencyappyt.domain.model.CoinDetail
import com.yscoding.cryptocurrencyappyt.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {

    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {

            emit(Resource.Loading<CoinDetail>())
            val coin = repository.getCoinById(coinId = coinId).toCoinDetail()
            emit(Resource.Success(coin))

        } catch (e: HttpException) {

            emit(Resource.Error<CoinDetail>(e.localizedMessage ?: "An unexpected error occurred!"))

        } catch (e: IOException) {

            emit(Resource.Error<CoinDetail>(e.localizedMessage ?: "Couldn't connect to the server!"))

        }
    }
}