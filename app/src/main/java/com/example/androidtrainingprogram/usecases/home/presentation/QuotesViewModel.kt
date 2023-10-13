package com.example.androidtrainingprogram.usecases.home.presentation

import android.content.Context
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.androidtrainingprogram.R
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class QuotesViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val quotes = arrayListOf<String>()

    private var type: String? = null
    private var author: String? = null

    init {
        type = savedStateHandle.get<String>("type") ?: ""
        author = savedStateHandle.get<String>("author") ?: ""
//        quotes.add("There is nothing more deceptive than an obvious fact.")
//        quotes.add("There is nothing more deceptive than an obvious fact.")
//        quotes.add("There is nothing more deceptive than an obvious fact.")
//        quotes.add("There is nothing more deceptive than an obvious fact.")
//        quotes.add("There is nothing more deceptive than an obvious fact.")
        println(type)
        println(author)
    }

    fun getQuotes(): ArrayList<String> {
        return quotes
    }
}