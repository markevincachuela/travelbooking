package com.example.travelbookingapp.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.travelbookingapp.features.details.DetailsScreen
import com.example.travelbookingapp.features.home.HomeScreen
import com.example.travelbookingapp.features.login.LoginScreen
import com.example.travelbookingapp.utils.Screen

@Composable
fun Navigation(
    navController: NavHostController
) {

    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route
    ) {
        composable(Screen.HomeScreen.route) {
            HomeScreen(navController = navController)
        }
        composable(Screen.DetailsScreen.route) {
            DetailsScreen(navController = navController)
        }
        composable(Screen.Loginscreen.route) {
            LoginScreen(navController = navController)
        }
    }

}