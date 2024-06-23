package com.example.travelbookingapp.features.settings

interface SettingsViewFactory {
    fun makeView(type: String) : SettingsDisplay?
}