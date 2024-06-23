package com.example.travelbookingapp.features.login.fields.views

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.travelbookingapp.features.login.fields.FieldType
import com.example.travelbookingapp.features.login.fields.IFieldDisplay
import com.example.travelbookingapp.features.login.fields.IFieldViewFactory

class EmailFieldView(
    override val fieldType: FieldType
): BaseFieldView(fieldType) {

    @Composable
    override fun LoginDisplay(modifier: Modifier) {
        Text(text = "LOGIN ghghghgyffyfyfy")
    }
}

class EmailFieldFactory: IFieldViewFactory {
    companion object {
        const val systemName = "email"
    }
    override fun make(fieldType: FieldType): IFieldDisplay {
        return EmailFieldView(fieldType)
    }
}