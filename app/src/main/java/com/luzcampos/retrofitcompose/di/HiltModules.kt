package com.luzcampos.retrofitcompose.di

import com.google.gson.Gson
import com.luzcampos.retrofitcompose.network.APIService
import com.luzcampos.retrofitcompose.ui.components.MainRepository
import com.luzcampos.retrofitcompose.util.Constant
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object HiltModules {

    @Singleton
    @Provides
    fun provideApiService():APIService{
        return Retrofit.Builder().baseUrl(  Constant.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
            .create(APIService::class.java)

    }

    @Provides
    fun provideMainRepository(apiService: APIService):MainRepository{
        return MainRepository(apiService = apiService)
    }
}
