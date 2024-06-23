package com.example.travelbookingapp.features.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.travelbookingapp.features.useraccount.builder.PersonBuilder

@Composable
fun HomeScreen(
    navController: NavController
) {

    val test = PersonBuilder.Builder()
        .setFirstname("Mark kevin")
        .setLastname("Cachuela")
        .setAge(1)
        .type("Student")
        .build()

    test.personModel.let {

    }

    Text(text = "HOMEEE")



}