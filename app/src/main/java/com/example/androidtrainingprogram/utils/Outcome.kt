package com.example.androidtrainingprogram.utils

sealed class Outcome<T>() {
    class Start<T>(var showLoader: Boolean = true) : Outcome<T>()
    class End<T> : Outcome<T>()
    class Success<T>(var data: T) : Outcome<T>()
    class Error<T>(
        val e: Exception? = null,
        var showErrorDialog: Boolean,
        var message: String? = null,
        var responseCode: String? = null
    ) : Outcome<T>()
}