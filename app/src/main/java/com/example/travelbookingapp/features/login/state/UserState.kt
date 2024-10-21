package com.example.travelbookingapp.features.login.state

import androidx.navigation.NavController

enum class UserState(
    val signUp: UserDisplay.(String) -> Unit,
    val viewProfile: UserDisplay.(NavController) -> Unit,
) {

    VIEW_PROFILE(
        signUp = { email = it; state = VIEW_PROFILE},
        viewProfile = { navController = it}
    ),
    REGISTER(
        signUp = { email = it; state = REGISTER},
        viewProfile = { navController = it }
    )
}