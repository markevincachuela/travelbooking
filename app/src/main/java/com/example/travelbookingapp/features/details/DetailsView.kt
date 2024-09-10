package com.example.travelbookingapp.features.details

import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.delay

@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun DetailScreenView(
    navController: NavController
) {
    var displayDetails by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        delay(500)
        displayDetails = true

    }

    BoxWithConstraints(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(topStart = 34.dp, topEnd = 34.dp))
                .padding(start = 34.dp, top = 34.dp, end = 34.dp, bottom = 24.dp)
                .background(Color.White)
                .align(Alignment.BottomCenter)
        ) {

            AnimatedVisibility(visible = displayDetails) {
                Text(text = "Details")
            }
            AnimatedVisibility(visible = displayDetails) {
                Text(text = "Details")
            }
            AnimatedVisibility(visible = displayDetails) {
                Text(text = "Details")
            }
            AnimatedVisibility(visible = displayDetails) {
                Text(text = "Details")
            }
            AnimatedVisibility(visible = displayDetails) {
                Text(text = "Details")
            }
            AnimatedVisibility(visible = displayDetails) {
                Text(text = "Details")
            }
            AnimatedVisibility(visible = displayDetails) {
                Text(text = "Details")
            }
            AnimatedVisibility(visible = displayDetails) {
                Text(text = "Details")
            }
            AnimatedVisibility(visible = displayDetails) {
                Text(text = "Details")
            }
            AnimatedVisibility(visible = displayDetails) {
                Text(text = "Details")
            }
            AnimatedVisibility(visible = displayDetails) {
                Text(text = "Details")
            }


        }

    }
}