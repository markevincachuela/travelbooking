package com.example.travelbookingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.travelbookingapp.features.bottombar.ui.BottomNavigationBar
import com.example.travelbookingapp.features.floatingbutton.FloatingButton
import com.example.travelbookingapp.ui.theme.TravelBookingAppTheme
import com.example.travelbookingapp.utils.Utils

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {
            val navigation = Utils.getNavigationBar()
            TravelBookingAppTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        BottomNavigationBar(navigation)
                    },
                    floatingActionButtonPosition = FabPosition.Center,
                    floatingActionButton = {
                        FloatingButton()
                    }
                )
                { innerPadding ->
                    Greeting(
                        name = "Android" ,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TravelBookingAppTheme {
        Greeting("Android")
    }
}