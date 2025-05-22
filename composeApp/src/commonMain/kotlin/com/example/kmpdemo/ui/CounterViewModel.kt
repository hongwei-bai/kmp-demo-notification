package com.example.kmpdemo.ui

import com.example.kmpdemo.data.MyRepository
import com.example.kmpdemo.ui.base.BaseViewModel
import com.example.kmpdemo.ui.util.CommonFlow
import com.example.kmpdemo.ui.util.asCommonFlow
import kotlinx.coroutines.flow.MutableStateFlow

// commonMain
class CounterViewModel(
    private val repository: MyRepository
) : BaseViewModel() {
    private val _count = MutableStateFlow(0)
    val count: CommonFlow<Int> = _count.asCommonFlow()

    fun increment() {
        _count.value++
    }

    fun decrement() {
        _count.value--
    }
}