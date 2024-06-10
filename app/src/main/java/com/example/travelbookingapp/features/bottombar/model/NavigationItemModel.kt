package com.example.travelbookingapp.features.bottombar.model

import com.example.travelbookingapp.features.bottombar.`interface`.NavigationIconMenuItem

data class NavigationBarItem(
    val items: List<NavigationItemModel>
)


data class NavigationItemModel(
    val name: String,
    val icon: NavigationIconMenuItem,
)