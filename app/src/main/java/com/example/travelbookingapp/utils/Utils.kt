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
                    icon = NavigationDrawbleIcon(R.drawable.icon_home)
                ),
                NavigationItemModel(
                    name = "Profile",
                    icon = NavigationDrawbleIcon(R.drawable.ic_launcher_foreground)
                ),
                NavigationItemModel(
                    name = "Search",
                    icon = NavigationDrawbleIcon(R.drawable.ic_launcher_foreground)
                ),
                NavigationItemModel(
                    name = "Settings",
                    icon = NavigationDrawbleIcon(R.drawable.ic_launcher_foreground)
                )
            )
        )

    }

}