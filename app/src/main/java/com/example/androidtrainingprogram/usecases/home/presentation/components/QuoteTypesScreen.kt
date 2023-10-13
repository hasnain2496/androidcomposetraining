package com.example.androidtrainingprogram.usecases.home.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.androidtrainingprogram.R
import com.example.androidtrainingprogram.ui.theme.ColorOrange
import com.example.androidtrainingprogram.usecases.home.presentation.QuoteTypesViewModel

@Composable
fun QuoteTypesScreen(
    viewModel: QuoteTypesViewModel = hiltViewModel(),
    onClick: (String) -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.background),
            contentDescription = "",
            contentScale = ContentScale.Crop
        )

        LazyVerticalGrid(
            modifier = Modifier.fillMaxSize(),
            columns = GridCells.Fixed(2)
        ) {
            itemsIndexed(viewModel.types) { _, quoteType ->
                QuoteTypeItem(quoteType, onClick)
            }
        }
    }
}

@Composable
fun QuoteTypeItem(type: String, onClick: (String) -> Unit) {
    Box(
        modifier = Modifier
            .height(100.dp)
            .padding(8.dp)
            .background(
                ColorOrange,
                shape = RoundedCornerShape(8.dp)
            )
            .clickable {
                onClick(type)
            },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = type,
            style = MaterialTheme.typography.body1.copy(
                color = Color.White
            )
        )
    }
}
