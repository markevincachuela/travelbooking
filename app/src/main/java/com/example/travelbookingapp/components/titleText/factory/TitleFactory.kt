package com.example.travelbookingapp.components.titleText.factory

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.TextUnit

interface TitleFactory {
    @Composable
    fun CreateTitleScreen(
        title: String,
        subtitle: String?,
        fontSize : TextUnit
    )
}
