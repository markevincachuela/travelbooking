package com.example.travelbookingapp.features.home

import android.widget.Space
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.travelbookingapp.R
import com.example.travelbookingapp.components.images.RoundedImage
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


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            RoundedImage(
                image = painterResource(R.drawable.login_background),
                cornerRadius = 50.dp
            )
            Text(text = "World")

            Text(text = "tst")

        }

        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier
                .background(Color.Red)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
                    .background(Color.DarkGray)
            ) {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(text = "Name place")
                    Text(text = "sadasdas")
                }
                
                Spacer(modifier = Modifier.height(250.dp))

            }
        }

        Box(
            modifier = Modifier
                .padding(10.dp)
                .background(Color.Green)
                .fillMaxSize(),
            contentAlignment = Alignment.BottomStart
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "asdadasd")
                    Text(text = "asdadasd")
                }

                Spacer(modifier = Modifier.height(10.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "asdadasd")
                    Text(text = "asdadasd")
                }

            }
        }
    }
}