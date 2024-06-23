package com.example.travelbookingapp.features.login.fields.views

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.travelbookingapp.features.login.fields.FieldType
import com.example.travelbookingapp.features.login.fields.IFieldDisplay

open class BaseFieldView(
    override val fieldType: FieldType
): IFieldDisplay {
    @Composable
    override fun LoginDisplay(
        modifier: Modifier
    ){

    }
}