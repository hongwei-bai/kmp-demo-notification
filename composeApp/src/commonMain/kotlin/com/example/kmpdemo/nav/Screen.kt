package com.example.kmpdemo.nav

sealed class Screen(val title: String) {
    object Home : Screen("Home")
    object Settings : Screen("Settings")
    data class Details(val itemId: String) : Screen("Details") // for non-tab navigation
}

val tabScreens = listOf(Screen.Home, Screen.Settings)