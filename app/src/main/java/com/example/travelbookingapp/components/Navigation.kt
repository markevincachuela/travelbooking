package com.example.travelbookingapp.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.travelbookingapp.components.images.BeachImages
import com.example.travelbookingapp.features.home.HomeScreen
import com.example.travelbookingapp.features.login.LoginScreen
import com.example.travelbookingapp.features.login.viewmodel.LoginViewModel
import com.example.travelbookingapp.features.settings.ui.SettingsScreen
import com.example.travelbookingapp.utils.Screen

@Composable
fun Navigation(
    navController: NavHostController,
    listOfImages : List<BeachImages>
) {

    val loginViewModel = LoginViewModel()
    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route
    ) {
        composable(Screen.HomeScreen.route) {
            HomeScreen(
                navController = navController,
                listOfImages = listOfImages
            )
        }
        composable(Screen.DetailsScreen.route) {
            SettingsScreen(navController = navController)
        }
        composable(Screen.Loginscreen.route) {
            LoginScreen(
                navController = navController,
                loginViewModel = loginViewModel
            )
        }
    }

}