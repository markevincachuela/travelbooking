package com.example.travelbookingapp.features.login.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.travelbookingapp.features.login.fields.FieldType

class LoginViewModel:ViewModel() {

    var fields: MutableState<List<FieldType>> = mutableStateOf(emptyList())

    fun getFields(){
        fields.value = listOf(
            FieldType(name = "email"),
            FieldType(name = "password")
        )
    }

}