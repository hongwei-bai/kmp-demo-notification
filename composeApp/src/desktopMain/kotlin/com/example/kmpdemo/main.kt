package com.example.kmpdemo

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.example.kmpdemo.database.DatabaseHelper
import com.example.kmpdemo.di.commonModule
import com.example.kmpdemo.di.platformModule
import org.koin.core.context.GlobalContext.startKoin
import org.koin.java.KoinJavaComponent.get

fun main() = application {
    startKoin {
        modules(platformModule, commonModule)
    }

    val dbHelper: DatabaseHelper = get(DatabaseHelper::class.java)

    Window(
        onCloseRequest = ::exitApplication,
        title = "kmp-compose-demo",
    ) {
        App()
    }
}