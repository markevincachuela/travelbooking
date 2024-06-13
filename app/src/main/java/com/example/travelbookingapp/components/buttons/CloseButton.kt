package com.example.travelbookingapp.components.buttons

import androidx.compose.ui.graphics.Shape
import android.widget.Button
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun CloseButton(
    imageVector: ImageVector = Icons.Default.Close,
    onClick: () -> Unit,
    contentDescription: String = "Close",
    config: CloseIconButtonConfig,
    modifier: Modifier = Modifier,
) {

    Button(
        onClick = { onClick.invoke() },
        modifier = modifier.size(config.preferredSize),
        shape = config.shape,
        contentPadding= PaddingValues(0.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = config.backgroundColor,
            contentColor = config.tint
        )
    ) {
        Icon(
            imageVector = imageVector,
            contentDescription =contentDescription )
    }
}


data class CloseIconButtonConfig(
    var backgroundColor: Color,
    var tint: Color,
    var preferredSize: Dp,
    var shape: Shape
) {
    companion object{
        @Composable
        fun default(
            backgroundColor: Color,
            tint: Color,
            preferredSize: Dp = 40.dp,
            shape: Shape = CircleShape
        ) = CloseIconButtonConfig(
            backgroundColor = backgroundColor,
            tint = tint,
            preferredSize = preferredSize,
            shape = shape
        )
    }
}