package com.example.kmpdemo

import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.example.kmpdemo.database.DatabaseHelper
import com.example.kmpdemo.di.commonModule
import com.example.kmpdemo.di.platformModule
import com.example.kmpdemo.domain.SomeUseCase
import org.koin.core.context.GlobalContext.startKoin
import org.koin.java.KoinJavaComponent.get
import java.awt.Window

fun main() = application {
    startKoin {
        modules(platformModule, commonModule)
    }

    val dbHelper: DatabaseHelper = get(DatabaseHelper::class.java)
    val someUseCase: SomeUseCase = get(SomeUseCase::class.java)

    Window(
        undecorated = true,
        onCloseRequest = ::exitApplication,
        title = "kmp-compose-demo",
    ) {
        val awtWindow = this.window
        CompositionLocalProvider(LocalWindow provides awtWindow) {
            App(someUseCase)
        }
    }
}

val LocalWindow = staticCompositionLocalOf<Window> {
    error("LocalWindow not provided")
}