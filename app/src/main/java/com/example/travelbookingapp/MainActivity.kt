package com.example.travelbookingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.travelbookingapp.components.Navigation
import com.example.travelbookingapp.features.bottombar.ui.BottomNavigationBar
import com.example.travelbookingapp.features.floatingbutton.FloatingButton
import com.example.travelbookingapp.features.login.fields.FieldDisplayFactoryRegistry
import com.example.travelbookingapp.features.settings.factory.SettingViewFactoryRegistry
import com.example.travelbookingapp.ui.theme.TravelBookingAppTheme
import com.example.travelbookingapp.utils.Utils

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        FieldDisplayFactoryRegistry.getInstance().registerFields()
        SettingViewFactoryRegistry.getInstance().registerSettingview()

        enableEdgeToEdge()
        setContent {
            val navigation = Utils.getNavigationBar()
            TravelBookingAppTheme {
                val navController = rememberNavController()

                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        BottomNavigationBar(
                            navigation = navigation,
                            navController = navController
                        )
                    },
                    floatingActionButtonPosition = FabPosition.Center,
                    floatingActionButton = {
                        FloatingButton()
                    }
                )
                { innerPadding ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                        ) {
                            Navigation(
                                navController = navController
                            )
                        }
                    }
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