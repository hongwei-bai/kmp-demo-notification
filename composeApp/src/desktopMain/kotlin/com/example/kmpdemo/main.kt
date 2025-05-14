package com.example.kmpdemo

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.example.kmpdemo.database.DatabaseDriverFactory
import com.example.kmpdemo.database.DatabaseHelper

fun main() = application {
    val driverFactory = DatabaseDriverFactory()
    val databaseHelper = DatabaseHelper(driverFactory)

    Window(
        onCloseRequest = ::exitApplication,
        title = "kmp-compose-demo",
    ) {
        App()
    }
}