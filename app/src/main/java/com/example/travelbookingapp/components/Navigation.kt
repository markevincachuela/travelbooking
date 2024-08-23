package com.example.travelbookingapp.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.travelbookingapp.components.images.BeachItem
import com.example.travelbookingapp.components.images.Categories
import com.example.travelbookingapp.features.details.DetailsScreen
import com.example.travelbookingapp.features.home.HomeScreen
import com.example.travelbookingapp.features.login.LoginScreen
import com.example.travelbookingapp.features.login.viewmodel.LoginViewModel
import com.example.travelbookingapp.features.settings.ui.SettingsScreen
import com.example.travelbookingapp.utils.Screen

@Composable
fun Navigation(
    navController: NavHostController,
    listOfImages : List<BeachItem>,
    categories: Categories
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
            DetailsScreen(
                navController = navController,
                categories = categories
            )
        }
        composable(Screen.Loginscreen.route) {
            LoginScreen(
                navController = navController,
                loginViewModel = loginViewModel
            )
        }
    }
}