package com.example.travelbookingapp.features.bottombar.`interface`

import androidx.annotation.DrawableRes
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

interface NavigationIconMenuItem{
    @Composable
    fun Display(
        tintColor: Color,
        modifier: Modifier
    )
}

data class NavigationDrawbleIcon(@DrawableRes val res: Int): NavigationIconMenuItem{
    @Composable
    override fun Display(
        tintColor: Color,
        modifier: Modifier
    ) {
        Icon(painter = painterResource(id = res),
            contentDescription = null,
            modifier = modifier
        )

    }
}