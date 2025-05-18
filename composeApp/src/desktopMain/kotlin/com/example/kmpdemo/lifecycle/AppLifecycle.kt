package com.example.kmpdemo.lifecycle

actual class AppLifecycle {
    actual fun observeLifecycle(
        onEnterForeground: () -> Unit,
        onEnterBackground: () -> Unit
    ) {
        // No real backgrounding; you could add window focus tracking here if needed
        onEnterForeground()
    }
}