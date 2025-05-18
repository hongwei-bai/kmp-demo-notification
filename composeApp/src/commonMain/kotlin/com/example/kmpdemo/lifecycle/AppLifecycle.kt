package com.example.kmpdemo.lifecycle

expect class AppLifecycle() {
    fun observeLifecycle(onEnterForeground: () -> Unit, onEnterBackground: () -> Unit)
}