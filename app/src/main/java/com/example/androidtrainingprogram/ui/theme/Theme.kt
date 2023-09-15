package com.example.androidtrainingprogram.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val darkColorScheme = darkColors(
    primary = Purple80,
    secondary = PurpleGrey80,
)

private val lightColorScheme = lightColors(
    primary = Purple40,
    secondary = PurpleGrey40,
)

@Composable
fun AndroidTrainingProgramTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = Purple40.toArgb()
        }
    }

    MaterialTheme(
        colors = if (darkTheme) darkColorScheme else lightColorScheme,
        typography = Typography,
        content = content
    )
}