package com.example.travelbookingapp.features.settings

import androidx.compose.runtime.Composable
import com.example.travelbookingapp.features.settings.factory.SettingViewFactoryRegistry

interface SettingsDisplay {
    @Composable
    fun DisplaySettings()
}

interface SettingViewModelFactory {
    fun make(): SettingsDisplay
}

interface SettingViewModelElementFactory {
    fun makeView(): SettingsDisplay?
    fun getFactory(identifier: String): SettingViewModelFactory? =
        SettingViewFactoryRegistry.getInstance().getFactory(identifier)
}