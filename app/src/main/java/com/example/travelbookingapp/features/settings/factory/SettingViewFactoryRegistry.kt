package com.example.travelbookingapp.features.settings.factory

import com.example.travelbookingapp.features.settings.SettingViewModelFactory
import com.example.travelbookingapp.features.settings.views.SettingTitleViewFactory

class SettingViewFactoryRegistry {

    private val settingsFactoryRegistry = HashMap<String, SettingViewModelFactory>()

   fun registerSettingview () {
       registerFactory("title",SettingTitleViewFactory())
   }


    companion object {
        private lateinit var instance: SettingViewFactoryRegistry
        private lateinit var factories: HashMap<String, SettingViewModelFactory>

        fun getInstance(): SettingViewFactoryRegistry {
            if (!Companion::instance.isInitialized) {
                instance = SettingViewFactoryRegistry()
                factories = HashMap()
            }

            return instance
        }
    }

    private fun registerFactory(type: String, factory: SettingViewModelFactory) {
        settingsFactoryRegistry[type] = factory
    }

    fun getFactory(type: String) = settingsFactoryRegistry[type]

}