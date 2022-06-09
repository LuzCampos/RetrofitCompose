package com.luzcampos.retrofitcompose.network

import com.luzcampos.retrofitcompose.network.model.PixabayResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {

    @GET("api/")
    suspend fun getQueryImages(
        @Query("q") query:String,
        @Query("key") apiKey:String,
        @Query("image_type") imageType:String
    ) : PixabayResponse

}