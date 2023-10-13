package com.example.androidtrainingprogram.usecases.home.presentation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidtrainingprogram.core.state.UIState
import com.example.androidtrainingprogram.usecases.home.data.model.GetProductsResponse
import com.example.androidtrainingprogram.usecases.home.data.repository.HomeRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val homeRepositoryImpl: HomeRepositoryImpl) :
    ViewModel() {

    private val _getProductsState = MutableLiveData(UIState<GetProductsResponse>())
    val getProductsState: LiveData<UIState<GetProductsResponse>> = _getProductsState

    fun getProducts() {
        _getProductsState.value = UIState(isLoading = true)
        viewModelScope.launch {
            try {
                val response = homeRepositoryImpl.getProducts()
                _getProductsState.value = UIState(response = response)
            } catch (e: Exception) {
                _getProductsState.value = UIState(error = e.message.orEmpty())
            }
        }
    }
}