package com.example.travelbookingapp.features.settings.views

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.travelbookingapp.features.settings.SettingViewModelFactory
import com.example.travelbookingapp.features.settings.SettingsDisplay

class SettingTitleView: SettingsDisplay {
    var title: String? = null
    @Composable
    override fun DisplaySettings() {
        val title = this.title ?: return
        Column {
            Log.d("KEEEVS","title === $title")
            Text(text = title)
        }

    }
}

class SettingTitleViewFactory: SettingViewModelFactory {

    override fun make(): SettingsDisplay {
        return SettingTitleView()
    }

}