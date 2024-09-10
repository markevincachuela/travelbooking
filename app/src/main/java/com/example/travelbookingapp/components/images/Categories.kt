package com.example.travelbookingapp.components.images

import androidx.compose.ui.graphics.vector.ImageVector

data class Categories(
    val categoriesItem: List<Category>
)
data class Category(
    val id: Int,
    val title: String,
    val image: Int,
    val location: String,
    val description: String,
    val category: CategorySelected,
    val subTitleDisplay: List<SubtitleDisplay>
)

data class SubtitleDisplay(
    val icon: ImageVector,
    val title: String
)

enum class CategorySelected{
    BEACH,
    TOURIST,
    SPA
}