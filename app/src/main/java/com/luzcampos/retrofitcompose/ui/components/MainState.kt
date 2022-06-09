package com.luzcampos.retrofitcompose.ui.components

import com.luzcampos.retrofitcompose.network.model.Hit

data class MainState(
    val isLoading:Boolean=false,
    val data:List<Hit> = emptyList(),
    val error:String = ""
)
