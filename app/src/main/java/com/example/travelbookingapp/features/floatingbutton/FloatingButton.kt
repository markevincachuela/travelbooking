package com.example.travelbookingapp.features.floatingbutton

import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FloatingButton() {
    SmallFloatingActionButton(
        modifier = Modifier
            .offset(y = 80.dp)
            .padding(10.dp),
        onClick = { /*TODO*/ },
        contentColor = MaterialTheme.colorScheme.primary,
    ) {
        Icon(Icons.Filled.Add, "")
    }

}