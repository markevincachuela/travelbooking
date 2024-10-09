package com.example.travelbookingapp.utils

sealed class Screen(val route: String) {
    data object HomeScreen : Screen("home_screen")
    data object DetailsOverviewScreen : Screen("details_overview_screen")
    data object Loginscreen : Screen("login_screen")
    data object DetailsScreen : Screen("details_screen")
    data object SettingsScreen : Screen("settings_screen")
}