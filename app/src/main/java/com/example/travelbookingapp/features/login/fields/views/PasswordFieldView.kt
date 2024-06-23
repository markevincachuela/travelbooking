package com.example.travelbookingapp.features.login.fields.views

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.travelbookingapp.features.login.fields.FieldType
import com.example.travelbookingapp.features.login.fields.IFieldDisplay
import com.example.travelbookingapp.features.login.fields.IFieldViewFactory

class PasswordFieldView(
    override val fieldType: FieldType
): BaseFieldView(fieldType){
    @Composable
    override fun LoginDisplay(modifier: Modifier) {
        Row {
            Text(text = "LOGIN PASSWORD")
            Text(text = " ghghghghg")
        }

    }
}

class PasswordFieldFactory: IFieldViewFactory {
    companion object {
        const val systemName = "password"
    }
    override fun make(fieldType: FieldType): IFieldDisplay {
        return PasswordFieldView(fieldType)
    }

}