package com.example.travelbookingapp.features.login.fields.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.travelbookingapp.features.login.fields.FieldType
import com.example.travelbookingapp.features.login.fields.IFieldDisplay
import com.example.travelbookingapp.features.login.fields.IFieldViewFactory

class PasswordFieldView(
    override val fieldType: FieldType
): BaseFieldView(fieldType){
    @Composable
    override fun LoginDisplay(modifier: Modifier) {
        var text by remember { mutableStateOf("") }
        Column {
            Text(text = "Password")
            TextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("Enter text") }
            )
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