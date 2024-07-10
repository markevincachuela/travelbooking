package com.example.travelbookingapp.features.bottombar.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.travelbookingapp.features.bottombar.model.NavigationBarItem
import com.example.travelbookingapp.features.bottombar.model.NavigationItemModel

@Composable
fun BottomNavigationBar(
    navigation: NavigationBarItem,
    navController : NavController
) {

    var selectedItem by remember { mutableIntStateOf(0) }
    fun onTapMenuItem(menuItem : NavigationItemModel) {
        selectedItem = navigation.items.indexOf(menuItem)
        navController.navigate(menuItem.screen)
    }

    val midButton = (navigation.items.count() / 2) + 1
    NavigationBar{
        navigation.items.forEachIndexed { index, item ->
            if ((index + 1) == midButton) {
                NavigationBarItem(
                    selected = false,
                    onClick = { /*TODO*/ },
                    icon = { /*TODO*/ },
                    enabled = false)
            }
            NavigationBarItem(
                selected = selectedItem == index,
                onClick = {
                    onTapMenuItem(item)
                },
                icon = {
                    BottomNavigationBarItemIcon(
                        item = item
                    )
                },
            )
        }
    }
}


@Composable
fun BottomNavigationBarItemIcon(
    item: NavigationItemModel
){

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Spacer(modifier = Modifier
            .width(15.dp)
            .height(2.dp)
            .clip(
                RoundedCornerShape(
                    bottomStart = 10.dp,
                    bottomEnd = 10.dp
                )
            )
            .align(alignment = Alignment.TopCenter)
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item.icon.Display(
                tintColor = Color.Black,
                modifier = Modifier.size(24.dp)
            )

            Text(
                text = item.name,
                textAlign = TextAlign.Center
            )
        }
    }
}
