package com.example.androidtrainingprogram.usecases.home.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androidtrainingprogram.ui.theme.AndroidTrainingProgramTheme
import com.example.androidtrainingprogram.usecases.home.presentation.components.HomeScreen
import com.example.androidtrainingprogram.usecases.home.utils.HomeConstants
import dagger.hilt.android.AndroidEntryPoint

const val TAG = "ATP"

@AndroidEntryPoint
class HomeActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            AndroidTrainingProgramTheme {
                NavHost(
                    navController = navController,
                    startDestination = HomeConstants.Routes.home
                ) {
                    composable("home") {
                        HomeScreen()
                    }
                }
            }
        }
    }
}