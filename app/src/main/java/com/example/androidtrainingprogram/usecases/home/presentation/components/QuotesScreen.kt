package com.example.androidtrainingprogram.usecases.home.presentation.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.androidtrainingprogram.R
import com.example.androidtrainingprogram.ui.theme.ColorLightGray
import com.example.androidtrainingprogram.ui.theme.ColorOrange
import com.example.androidtrainingprogram.usecases.home.presentation.QuotesViewModel
import com.example.androidtrainingprogram.usecases.home.presentation.TAG

@Composable
//fun QuotesScreen(
//    type: String,
//    author: String,
fun QuotesScreen(
    viewModel: QuotesViewModel = hiltViewModel()
) {
//    Log.d(TAG, "QuotesScreen: $type")
//    Log.d(TAG, "QuotesScreen: $author")

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.background),
            contentDescription = "",
            contentScale = ContentScale.Crop
        )

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            itemsIndexed(viewModel.getQuotes()) { _, quote ->
                QuoteItem(quote)
            }
        }
    }
}

@Composable
fun QuoteItem(quote: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                ColorLightGray,
                shape = RoundedCornerShape(8.dp),
            )
            .border(
                width = 2.dp,
                color = ColorOrange,
                shape = RoundedCornerShape(8.dp),
            )
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = quote,
            style = MaterialTheme.typography.body1.copy(
                color = Color.White
            )
        )
    }
}
