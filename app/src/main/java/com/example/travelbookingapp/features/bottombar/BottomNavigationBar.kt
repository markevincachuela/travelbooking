package com.example.travelbookingapp.features.bottombar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun BottomNavigationBar() {

    var selectedItem by remember { mutableIntStateOf(0) }

    val items = listOf("Home", "Search","Profiles", "Profile")

    val midButton = (items.count() / 2) + 1
    NavigationBar {
        items.forEachIndexed { index, item ->

            if ((index + 1) == midButton) {
                NavigationBarItem(
                    selected = false,
                    onClick = { /*TODO*/ },
                    icon = { /*TODO*/ },
                    enabled = false)
            }
            NavigationBarItem(
                icon = {
                    Icon(Icons.Filled.Favorite, contentDescription = item)
                },
                label = {
                    Text(item)
                },
                selected = selectedItem == index,
                onClick = {
                    selectedItem = index
                }
            )
        }


    }

//    BottomAppBar(
//        actions = {
//            IconButton(onClick = { /* do something */ }) {
//                Icon(Icons.Filled.Check, contentDescription = "Localized description")
//            }
//            IconButton(onClick = { /* do something */ }) {
//                Icon(
//                    Icons.Filled.Edit,
//                    contentDescription = "Localized description",
//                )
//            }
//            IconButton(onClick = { /* do something */ }) {
//                Icon(
//                    Icons.Filled.AccountCircle,
//                    contentDescription = "Localized description",
//                )
//            }
//            IconButton(onClick = { /* do something */ }) {
//                Icon(
//                    Icons.Filled.Call,
//                    contentDescription = "Localized description",
//                )
//            }
//        },
////        floatingActionButton = {
////            FloatingActionButton(
////                onClick = { /* do something */ },
////                containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
////                elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
////            ) {
////                Icon(Icons.Filled.Add, "Localized description")
////            }
////        }
//    )
}
