package com.example.kmpdemo.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.StateFlow

class CounterAndroidViewModel(
    private val counterViewModel: CounterViewModel
) : ViewModel() {

    // Use the count property directly (already a CommonFlow or StateFlow)
    val count: StateFlow<Int> get() = counterViewModel.count as StateFlow<Int>

    fun increment() = counterViewModel.increment()
    fun decrement() = counterViewModel.decrement()

    override fun onCleared() {
        super.onCleared()
        counterViewModel.onCleared()
    }
}