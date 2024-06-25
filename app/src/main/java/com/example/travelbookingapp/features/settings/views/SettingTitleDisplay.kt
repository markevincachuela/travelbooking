package com.example.travelbookingapp.features.settings.views


import android.util.Log
import com.example.travelbookingapp.features.settings.SettingViewModelElementFactory
import com.example.travelbookingapp.features.settings.SettingsDisplay

data class SettingTitleDisplay(
    val title: String
): SettingViewModelElementFactory {
    override fun makeView(): SettingsDisplay? {
        val factory = getFactory("title")
        val view = factory?.make() as? SettingTitleView
        view?.title = title
        Log.d("KEEEVS","SettingTitleDisplay: $title")
        return view
    }

}