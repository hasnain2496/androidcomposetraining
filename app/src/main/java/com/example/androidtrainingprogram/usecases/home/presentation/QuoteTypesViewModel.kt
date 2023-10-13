package com.example.androidtrainingprogram.usecases.home.presentation

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class QuoteTypesViewModel @Inject constructor() : ViewModel() {

    val types = arrayListOf(
        "Android",
        "iOS",
        "Facts",
        "Technology",
        "Sports",
        "Sports",
        "Sports",
        "Sports",
        "Sports",
        "Sports",
        "Sports",
        "Sports",
        "Sports",
        "Sports",
        "Sports",
        "Sports",
        "Sports",
        "Sports",
        "Sports",
        "Sports",
    )
}