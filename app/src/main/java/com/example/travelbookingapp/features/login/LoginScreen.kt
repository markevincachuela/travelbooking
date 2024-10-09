package com.example.travelbookingapp.features.login

import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import com.example.travelbookingapp.R
import com.example.travelbookingapp.components.buttons.CloseButton
import com.example.travelbookingapp.components.buttons.CloseIconButtonConfig
import com.example.travelbookingapp.features.login.fields.FieldDisplayFactoryRegistry
import com.example.travelbookingapp.features.login.viewmodel.LoginViewModel
import kotlinx.coroutines.delay

@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun LoginScreen(
    navController: NavController,
    loginViewModel: LoginViewModel
) {

    val factory = FieldDisplayFactoryRegistry.getInstance()

    val closeButtonBackgroundColor = Color.Black
    val closeButtonTintColor = Color.White

    var displayFields by remember { mutableStateOf(false) }

    val fieldViews = loginViewModel.fields.value.mapNotNull {
        val view = factory.getFactory(it.name)?.make(it)
        view
    }

    loginViewModel.getFields()

    LaunchedEffect(Unit) {
        delay(500)
        displayFields = true
    }


    BoxWithConstraints(
        modifier = Modifier.fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = R.drawable.home_beach_screen),
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

            AnimatedVisibility(
                visible = displayFields
            ) {
                Column {
                    fieldViews.forEachIndexed{ index, item ->
                        val paddingTop = if (index == 0) 0.dp else 10.dp
                        AnimatedVisibility(visible = displayFields) {
                            item.LoginDisplay(modifier = Modifier
                                .padding(top = paddingTop))
                        }
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
}