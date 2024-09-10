package com.example.travelbookingapp.components.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.travelbookingapp.R
import com.example.travelbookingapp.utils.FullScreenDialog

class DetailDialogFragment : FullScreenDialog() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                DetailsDialogContent()
            }
        }
    }

    @Composable
    fun DetailsDialogContent() {
        Box(
            modifier = Modifier.padding(10.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .size(300.dp)
                    .background(Color.White),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.home_beach_screen),
                    contentDescription = "Login Background",
                    modifier = Modifier
                        .size(150.dp)
                        .padding(10.dp),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "DetailDialogFragment"
                )
                Text(
                    modifier = Modifier.padding(10.dp),
                    text = "Description asdsadasdsadsadsadsadsadsadsaadsadsdsadsadsadsadasasdasdasdsadsadsadasdsa"
                )
                Button(onClick = {
                    dialog?.dismiss()
                }) {
                    Text(text = "Exit")
                }
            }
        }

    }


}