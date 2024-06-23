package com.example.travelbookingapp.features.settings.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.travelbookingapp.features.settings.SettingsViewFactory
import com.example.travelbookingapp.features.settings.factory.SettingViewFactoryRegistry

@Composable
fun SettingsScreen(
    navController: NavController
) {

    val factory = SettingViewFactoryRegistry.getInstance()
    Column {
        Text(text = "Settings xxxxxxx")

        Spacer(modifier = Modifier.padding(top = 10.dp))
        Text(text = "Settings Screensss")

        factory.makeView("title")?.DisplaySettings()

    }


}