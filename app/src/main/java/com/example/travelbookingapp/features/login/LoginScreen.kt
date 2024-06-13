package com.example.travelbookingapp.features.login

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import com.example.travelbookingapp.R
import com.example.travelbookingapp.components.buttons.CloseButton
import com.example.travelbookingapp.components.buttons.CloseIconButtonConfig

@Composable
fun LoginScreen(
    navController: NavController
) {

    val closeButtonBackgroundColor = Color.Black
    val closeButtonTintColor = Color.White

    BoxWithConstraints(
        modifier = Modifier.fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = R.drawable.login_background),
            contentDescription = "Login Background",
            modifier = Modifier.matchParentSize(),
            contentScale = ContentScale.Crop
        )

        CloseButton(
            imageVector = Icons.Default.Close,
            contentDescription = "Close Button",
            onClick = { navController.popBackStack() },
            config = CloseIconButtonConfig.default(
                backgroundColor = closeButtonBackgroundColor,
                tint = closeButtonTintColor
            ),
            modifier = Modifier
                .zIndex(Float.MAX_VALUE)
                .align(Alignment.TopEnd)
                .padding(20.dp)
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(topStart = 34.dp, topEnd = 34.dp))
                .background(Color.White)
                .padding(start = 34.dp, top = 34.dp, end = 34.dp, bottom = 24.dp)
                .align(Alignment.BottomCenter)
        ) {

        }
    }
}