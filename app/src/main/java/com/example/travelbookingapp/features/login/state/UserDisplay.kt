package com.example.travelbookingapp.features.login.state

import androidx.navigation.NavController

class UserDisplay(
    var email: String? = null,
    var state: UserState,
    var navController: NavController
) {

    fun signUp(email: String?) = this.email?.let { state.signUp(this, it) }

    fun viewProfile(navController: NavController) = state.viewProfile(this,navController)
}