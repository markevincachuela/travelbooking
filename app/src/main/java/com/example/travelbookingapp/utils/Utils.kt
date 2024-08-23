package com.example.travelbookingapp.utils

import com.example.travelbookingapp.R
import com.example.travelbookingapp.components.images.BeachItem
import com.example.travelbookingapp.components.images.BeachItems
import com.example.travelbookingapp.components.images.Categories
import com.example.travelbookingapp.components.images.Category
import com.example.travelbookingapp.components.images.CategorySelected
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

    fun getBeachImages(): BeachItems {
        return BeachItems(
            items = listOf(
                BeachItem(
                    images = R.drawable.login_background,
                    title = "kevs1",
                    subTitle = "",
                    description = ""
                ),
                BeachItem(
                    images = R.drawable.login_background,
                    title = "kevs2",
                    subTitle = "",
                    description = ""
                ),
                BeachItem(
                    images = R.drawable.login_background,
                    title = "kevs3",
                    subTitle = "",
                    description = ""
                ),
                BeachItem(
                    images = R.drawable.login_background,
                    title = "kevs4",
                    subTitle = "",
                    description = ""
                ),
                BeachItem(
                    images = R.drawable.login_background,
                    title = "kevs5",
                    subTitle = "",
                    description = ""
                ),
                BeachItem(
                    images = R.drawable.login_background,
                    title = "kevs6",
                    subTitle = "",
                    description = ""
                )
            )
        )
    }

    fun getCategories(): Categories {
        return Categories(
            categoriesItem = listOf(
                Category(
                    id = 1,
                    title = "kevs1",
                    image = R.drawable.login_background,
                    location = "Location",
                    description = "Description",
                    category = CategorySelected.SPA
                ),
                Category(
                    id = 2,
                    title = "kevs2",
                    image = R.drawable.login_background,
                    location = "Location",
                    description = "Description",
                    category = CategorySelected.BEACH
                ),
                Category(
                    id = 3,
                    title = "kevs3",
                    image = R.drawable.login_background,
                    location = "Location",
                    description = "Description",
                    category = CategorySelected.TOURIST
                ),
                Category(
                    id = 4,
                    title = "kevs4",
                    image = R.drawable.login_background,
                    location = "Location",
                    description = "Description",
                    category = CategorySelected.BEACH
                ),
                Category(
                    id = 5,
                    title = "kevs5",
                    image = R.drawable.login_background,
                    location = "Location",
                    description = "Description",
                    category = CategorySelected.SPA
                ),

            )
        )
    }

}