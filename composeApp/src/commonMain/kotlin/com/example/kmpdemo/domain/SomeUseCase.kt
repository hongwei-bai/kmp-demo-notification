package com.example.kmpdemo.domain

import com.example.kmpdemo.data.MyRepository

class SomeUseCase(
    private val repository: MyRepository
) {
    fun runTest() {
        repository.test()
    }
}