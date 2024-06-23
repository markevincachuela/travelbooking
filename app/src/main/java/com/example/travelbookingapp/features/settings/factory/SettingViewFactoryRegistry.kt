package com.example.travelbookingapp.features.settings.factory

import com.example.travelbookingapp.features.settings.SettingsDisplay
import com.example.travelbookingapp.features.settings.SettingsViewFactory
import com.example.travelbookingapp.features.settings.views.SettingTitleDisplay

class SettingViewFactoryRegistry: SettingsViewFactory  {

    private val settingsFactoryRegistry = HashMap<String, () -> SettingsDisplay>()

    init {
        registerFactory("title") { SettingTitleDisplay() }
        registerFactory("signOut") { SettingsSignOut() }
    }

    companion object {
        private var instance: SettingViewFactoryRegistry? = null

        fun getInstance(): SettingViewFactoryRegistry {
            if (instance == null) {
                instance = SettingViewFactoryRegistry()
            }
            return instance!!
        }

    }

    private fun registerFactory(type: String, factory: () -> SettingsDisplay) {
        settingsFactoryRegistry[type] = factory
    }


    override fun makeView(type: String): SettingsDisplay? {
        return settingsFactoryRegistry[type]?.invoke()
    }

//    fun getFactory(type: String) = settingsFactoryRegistry[type]


}