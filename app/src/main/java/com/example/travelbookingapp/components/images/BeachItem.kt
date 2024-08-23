package com.example.travelbookingapp.components.images

data class BeachItems(
    val items: List<BeachItem>
)

data class BeachItem(
    val images: Int,
    val title: String,
    val subTitle: String,
    val description: String,
)
