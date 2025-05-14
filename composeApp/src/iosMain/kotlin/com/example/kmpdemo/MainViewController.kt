package com.example.kmpdemo

import androidx.compose.ui.window.ComposeUIViewController

fun MainViewController() = ComposeUIViewController {
    // Access the database helper via the platform instance
    val databaseHelper = getDatabaseHelper()

    // Pass it to your App composable
    App(databaseHelper = databaseHelper)
}