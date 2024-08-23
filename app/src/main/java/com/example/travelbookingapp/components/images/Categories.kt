package com.example.travelbookingapp.components.images

data class Categories(
    val categoriesItem: List<Category>
)
data class Category(
    val id: Int,
    val title: String,
    val image: Int,
    val location: String,
    val description: String,
    val category: CategorySelected
)

enum class CategorySelected{
    BEACH,
    TOURIST,
    SPA
}