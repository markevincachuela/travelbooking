package com.example.travelbookingapp.features.details

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.SizeTransform
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.fragment.app.FragmentManager
import androidx.navigation.NavController
import com.example.travelbookingapp.R
import com.example.travelbookingapp.components.images.Categories
import com.example.travelbookingapp.components.images.Category
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun DetailsOverviewScreen(
    navController: NavController,
    categories: Categories,
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {

        Column {

            Text(text = "Details")

            Spacer(modifier = Modifier.height(50.dp))

            LazyColumn {
                item {
                    categories.categoriesItem.forEach {
                        Spacer(modifier = Modifier.height(10.dp))
                        CategoriesItem(
                            categories = it,
                            navController = navController
                        )
                    }
                }
            }

        }
    }
}

@Composable
fun CategoriesItem(
    categories: Category,
    navController: NavController
) {

    //Flag for expanding the content
    var expanded by remember { mutableStateOf(false) }
    Surface(
        color = MaterialTheme.colorScheme.primary,
        onClick = { expanded = !expanded }
    ) {
        AnimatedContent(
            targetState = expanded,
            transitionSpec = {
                fadeIn(animationSpec = tween(200, 200)) togetherWith
                        fadeOut(animationSpec = tween(300)) using
                        SizeTransform { initialSize, targetSize ->

                            keyframes {
                                // Expand horizontally first.
                                IntSize(targetSize.width, initialSize.height) at 150
                                durationMillis = 300
                            }

                        }
            }, label = ""
        ) { targetExpanded ->
            if (targetExpanded) {
                // If the target state is true, expand the content.
                TestExpand(categories)
            } else {
                // If the target state is false, collapse the content.
                ContentIcon(categories)
            }
        }
    }
}

@Composable
fun TestExpand(categories: Category) {
    Box(
        Modifier
            .fillMaxWidth()
    ) {
        GlideImage(
            modifier = Modifier.size(600.dp),
            contentScale = ContentScale.Crop,
            imageModel = categories.image,
        )

        Column(
            Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(topStart = 34.dp, topEnd = 34.dp))
                    .background(Color.Black)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)

                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "Title")
                        Icon(
                            imageVector = Icons.Default.FavoriteBorder,
                            contentDescription = "Favorite"
                        )
                    }

                    Row {
                        Icon(
                            imageVector = Icons.Default.LocationOn,
                            contentDescription = "Favorite"
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(text = "Location")
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        SubTitlesSection(categories)
                    }


                    Spacer(modifier = Modifier.height(10.dp))

                    Divider(thickness = 2.dp)

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "About")

                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = stringResource(id = R.string.desciption1))

                }
            }
        }
    }

}

@Composable
fun SubTitlesSection(categories: Category) {
    categories.subTitleDisplay.forEach {
        Column {
            Row {
                Icon(
                    imageVector = it.icon,
                    contentDescription = "Favorite"
                )
                Spacer(modifier = Modifier.width(10.dp))

                Text(
                    text = it.title
                )
            }
        }
    }

}

@Composable
fun ContentIcon(categories: Category) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {

        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .background(MaterialTheme.colorScheme.primary)
                .fillMaxWidth()
        ) {

            Row(Modifier.padding(10.dp)) {
                Image(
                    modifier = Modifier
                        .clip(RoundedCornerShape(20.dp))
                        .width(200.dp)
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
}