package com.example.androidtrainingprogram.usecases.home.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavArgs
import androidx.navigation.NavArgument
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.androidtrainingprogram.ui.theme.AndroidTrainingProgramTheme
import com.example.androidtrainingprogram.ui.theme.ColorPrimary
import com.example.androidtrainingprogram.usecases.home.presentation.components.ComposableLifecycle
import com.example.androidtrainingprogram.usecases.home.presentation.components.ProfileScreen
import com.example.androidtrainingprogram.usecases.home.presentation.components.QuoteTypesScreen
import com.example.androidtrainingprogram.usecases.home.presentation.components.QuotesScreen
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
                    startDestination = HomeConstants.Routes.quoteTypes
                ) {
                    composable("home") {
                        HomeScreen {
                            navController.navigate(HomeConstants.Routes.profile)
                        }
                    }

                    composable(HomeConstants.Routes.quoteTypes) { backStackEntry ->
                        QuoteTypesScreen() { type ->
                            navController.navigate("quotes/$type/Saad")
                        }
                    }

                    composable(HomeConstants.Routes.profile) {
                        ProfileScreen()
                    }

//                    composable(
//                        HomeConstants.Routes.quotes,
//                        arguments = listOf(
//                            navArgument("type") { NavType.StringType },
//                            navArgument("author") { NavType.StringType }
//                        )
//                    ) { backStackEntry ->
//                        val type = backStackEntry.arguments?.getString("type") ?: ""
//                        val author = backStackEntry.arguments?.getString("author") ?: ""
//                        QuotesScreen(type, author)
//                    }

                    composable(
                        HomeConstants.Routes.quotes,
                        arguments = listOf(
                            navArgument("type") { NavType.StringType },
                            navArgument("author") { NavType.StringType }
                        )
                    ) { backStackEntry ->
                        QuotesScreen()
                    }
                }
            }

//            val navController = rememberNavController()
//            val viewModel = hiltViewModel<HomeViewModel>()
//            NavHost(navController = navController, startDestination = "home") {
//                composable("home") {
//                    HomeScreen() {
//                        navController.navigate("profile")
//                    }
//                }
//                composable("profile") {
//                    ProfileScreen()
//                }
//            }
        }
    }
}

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel(),
    onProfileClicked: () -> Unit
) {
    ComposableLifecycle { source, event ->
        when (event) {
            Lifecycle.Event.ON_STOP -> {
                Log.d(TAG, "HomeScreen: ON_STOP")
            }

            Lifecycle.Event.ON_DESTROY -> {
                Log.d(TAG, "HomeScreen: ON_DESTROY")
            }

            Lifecycle.Event.ON_CREATE -> {
                Log.d(TAG, "HomeScreen: ON_CREATE")
            }

            Lifecycle.Event.ON_START -> {
                Log.d(TAG, "HomeScreen: ON_START")
            }

            Lifecycle.Event.ON_RESUME -> {
                Log.d(TAG, "HomeScreen: ON_RESUME")
            }

            Lifecycle.Event.ON_PAUSE -> {
                Log.d(TAG, "HomeScreen: ON_PAUSE")
            }

            Lifecycle.Event.ON_ANY -> {
                Log.d(TAG, "HomeScreen: ON_ANY")
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(ColorPrimary)
    ) {
        Text(text = "Home ${viewModel.counter.value}", style = MaterialTheme.typography.h1)
        Button(onClick = {
            viewModel.counter.value++
        }) {
            Text(text = "Increment")
        }
        Button(onClick = {
            onProfileClicked()
        }) {
            Text(text = "Go To Profile")
        }
    }
}