package com.example.travelbookingapp.features.login.fields

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

interface IFieldDisplay {
    val fieldType: FieldType

    @Composable
    fun LoginDisplay(
        modifier: Modifier
    )

}

interface IFieldViewFactory {
    fun make(fieldType: FieldType): IFieldDisplay
}