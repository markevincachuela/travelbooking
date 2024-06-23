package com.example.travelbookingapp.features.login.fields

import com.example.travelbookingapp.features.login.fields.views.EmailFieldFactory
import com.example.travelbookingapp.features.login.fields.views.PasswordFieldFactory

class FieldDisplayFactoryRegistry {
    companion object {
        private lateinit var instance: FieldDisplayFactoryRegistry
        lateinit var factories: HashMap<String, IFieldViewFactory>

        fun getInstance(): FieldDisplayFactoryRegistry {
            if(!Companion::instance.isInitialized) {
                instance = FieldDisplayFactoryRegistry()
                factories = HashMap()
            }
            return instance
        }
    }

    fun registerFields(){
        registerFactory(EmailFieldFactory.systemName,EmailFieldFactory())
        registerFactory(PasswordFieldFactory.systemName,PasswordFieldFactory())
    }

    private fun registerFactory(name: String, factory: IFieldViewFactory) {
        if(factories.containsKey(name).not()) {
            factories[name] = factory
        }
    }

    fun getFactory(name: String) = factories[name]
}