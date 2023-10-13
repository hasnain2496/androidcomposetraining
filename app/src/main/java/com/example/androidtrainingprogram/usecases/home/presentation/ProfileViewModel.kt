package com.example.androidtrainingprogram.usecases.home.presentation

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

class ProfileViewModel @Inject constructor() : ViewModel() {

    val state = mutableStateOf("")

//    init {
//        getData()
//    }

    fun getData() {
        Log.d(TAG, "ProfileViewModel: HelloWorld")
        viewModelScope.launch {
            state.value = "Loading..."
            delay(3000)
            state.value = "Completed..."
        }
    }
}
