package com.example.travelbookingapp.utils

import androidx.fragment.app.DialogFragment
import com.example.travelbookingapp.R


open class FullScreenDialog: DialogFragment() {
    override fun getTheme(): Int {
        return R.style.FullscreenDialog
    }
}