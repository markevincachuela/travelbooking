package com.example.travelbookingapp.components.titleText.view

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.travelbookingapp.components.titleText.factory.TitleFactory

object TitleViewDisplay: TitleFactory {
    @Composable
    override fun CreateTitleScreen(
        title: String,
        subtitle: String?,
        fontSize: TextUnit
    ) {
        TitleView(
            title = title,
            subtitle = subtitle,
            fontSize = fontSize
        )
    }

    @Composable
    private fun TitleView(
        title: String,
        subtitle: String?,
        fontSize: TextUnit
    ) {

        Text(
            text = title,
            fontSize = fontSize
        )

        if (subtitle?.isNotEmpty() == true) {
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = subtitle)
        }

    }
}