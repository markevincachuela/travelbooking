package com.example.travelbookingapp.features.settings.factory

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.travelbookingapp.features.settings.SettingsDisplay

class SettingsSignOut: SettingsDisplay {
    @Composable
    override fun DisplaySettings() {
        Text(text = "SettingsSignOut")
    }
}