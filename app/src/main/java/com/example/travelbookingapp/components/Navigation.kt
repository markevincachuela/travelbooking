package com.example.travelbookingapp.components

import androidx.compose.runtime.Composable
import androidx.fragment.app.FragmentManager
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.travelbookingapp.components.images.BeachItem
import com.example.travelbookingapp.components.images.Categories
import com.example.travelbookingapp.features.details.DetailScreenView
import com.example.travelbookingapp.features.details.DetailsOverviewScreen
import com.example.travelbookingapp.features.home.HomeScreen
import com.example.travelbookingapp.features.login.LoginScreen
import com.example.travelbookingapp.features.login.viewmodel.LoginViewModel
import com.example.travelbookingapp.utils.Screen

@Composable
fun Navigation(
    navController: NavHostController,
    listOfImages : List<BeachItem>,
    categories: Categories,
    fragmentManager: FragmentManager
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
        composable(Screen.DetailsOverviewScreen.route) {
            DetailsOverviewScreen(
                navController = navController,
                categories = categories,
                fragmentManager = fragmentManager
            )
        }
        composable(Screen.Loginscreen.route) {
            LoginScreen(
                navController = navController,
                loginViewModel = loginViewModel
            )
        }
        composable(Screen.DetailsScreen.route) {
            DetailScreenView(
                navController = navController
            )
        }
    }
}