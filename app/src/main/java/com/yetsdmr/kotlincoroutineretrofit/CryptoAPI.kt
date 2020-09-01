package com.yetsdmr.kotlincoroutineretrofit

import retrofit2.Response
import retrofit2.http.GET

interface CryptoAPI {

    @GET("yetsdmr/CryptoJSONDataSet/master/crypto.json")
    suspend fun getData() : Response<List<CryptoModel>>
}