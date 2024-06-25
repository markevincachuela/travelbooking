package com.example.travelbookingapp.features.settings.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.travelbookingapp.features.settings.factory.SettingViewFactoryRegistry
import com.example.travelbookingapp.features.settings.views.SettingTitleDisplay
import com.example.travelbookingapp.features.settings.views.SettingTitleView

@Composable
fun SettingsScreen(
    navController: NavController
) {

    LazyColumn {
        SettingTitleDisplay("test sstitle").makeView()?.let {
            item {
                it.DisplaySettings()
            }
        }

        item {
            Text(text = "Settings xxxxxxx")
            Spacer(modifier = Modifier.padding(top = 10.dp))
        }

        item {
            Text(text = "Settings Screensss")

        }




    }


}