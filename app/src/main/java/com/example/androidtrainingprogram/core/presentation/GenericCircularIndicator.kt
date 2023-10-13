package com.example.androidtrainingprogram.core.presentation


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.androidtrainingprogram.ui.theme.ColorOrange

@Composable
fun GenericCircularIndicator(
    modifier: Modifier = Modifier,
    showLoading: Boolean,
    size: Dp = 60.dp
) {
    var showLoader = showLoading
    if (showLoader) {
        Dialog(
            onDismissRequest = { showLoader = false },
            DialogProperties(dismissOnBackPress = false, dismissOnClickOutside = false)
        ) {
            Box(
                contentAlignment = Center,
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.White, shape = RoundedCornerShape(8.dp))
            ) {
                CircularProgressIndicator(
                    modifier = modifier
                        .size(size)
                        .padding(0.dp, 0.dp, 0.dp, 0.dp),
                    color = ColorOrange,
                    strokeWidth = 2.dp,
                )
            }
        }
    }
}