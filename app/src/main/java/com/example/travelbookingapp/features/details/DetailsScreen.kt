package com.example.travelbookingapp.features.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.travelbookingapp.R
import com.example.travelbookingapp.components.images.Categories
import com.example.travelbookingapp.components.images.Category

@Composable
fun DetailsScreen(
    navController: NavController,
    categories : Categories
) {
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)
    ) {

        Column {

            Text(text = "Details")

            Spacer(modifier = Modifier.height(50.dp))

            LazyColumn {
                item {
                    categories.categoriesItem.forEach {
                        CategoriesItem(categories = it)
                    }
                }
            }

        }
    }
}

@Composable
fun CategoriesItem(
    categories: Category
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(Color.Red)
    ) {
        Row {
            Image(
                modifier = Modifier
                    .height(140.dp),
                painter = painterResource(id = categories.image),
                contentDescription = "Category Image",
                contentScale = ContentScale.FillHeight
            )
            Spacer(modifier = Modifier.size(10.dp))
            Column(
                modifier = Modifier.padding(5.dp)
            ) {
                Text(text = categories.title)
                Text(text = categories.location)
                Text(text = categories.description)
            }
        }
    }

}