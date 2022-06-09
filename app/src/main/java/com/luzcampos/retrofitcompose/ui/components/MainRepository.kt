package com.luzcampos.retrofitcompose.ui.components

import com.luzcampos.retrofitcompose.network.APIService
import com.luzcampos.retrofitcompose.network.model.PixabayResponse
import com.luzcampos.retrofitcompose.util.Constant
import com.luzcampos.retrofitcompose.util.Resource
import java.lang.Exception
import javax.inject.Inject

class MainRepository @Inject constructor(private  val apiService: APIService) {

    suspend fun getQueryItems(q:String):Resource<PixabayResponse>{
        return try {
            val result = apiService.getQueryImages(query = q, apiKey = Constant.KEY, imageType = "photo")
            Resource.Success(data = result)
        } catch (e:Exception){
            Resource.Error(message = e.message.toString())
        }
    }


}