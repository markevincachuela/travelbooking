package com.example.travelbookingapp.components.images

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun RoundedImage(
    image: Painter,
    cornerRadius: Dp,
) {
    Image(
        modifier = Modifier
            .size(50.dp)
            .clip(RoundedCornerShape(cornerRadius)),
        painter = image,
        contentDescription = "Rounded Image"
    )

}