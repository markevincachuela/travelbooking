package com.example.travelbookingapp.utils

import com.example.travelbookingapp.R
import com.example.travelbookingapp.features.bottombar.`interface`.NavigationDrawbleIcon
import com.example.travelbookingapp.features.bottombar.model.NavigationBarItem
import com.example.travelbookingapp.features.bottombar.model.NavigationItemModel

object Utils {

    fun getNavigationBar(): NavigationBarItem {
        return NavigationBarItem(
            items = listOf(
                NavigationItemModel(
                    name = "Home",
                    icon = NavigationDrawbleIcon(R.drawable.icon_home),
                    screen = "home_screen"
                ),
                NavigationItemModel(
                    name = "Details",
                    icon = NavigationDrawbleIcon(R.drawable.ic_launcher_foreground),
                    screen = "details_screen"
                ),
                NavigationItemModel(
                    name = "Search",
                    icon = NavigationDrawbleIcon(R.drawable.ic_launcher_foreground),
                    screen = "home_screen"
                ),
                NavigationItemModel(
                    name = "Settings",
                    icon = NavigationDrawbleIcon(R.drawable.ic_launcher_foreground),
                    screen = "login_screen"
                )
            )
        )

    }

}