package com.example.kmpdemo.nav

sealed class Screen(val title: String) {
    object Home : Screen("Home")
    object Colors : Screen("Colors")
    object Typography : Screen("Typography")
    object Fonts : Screen("Fonts")
    object Icons : Screen("Icons")
    data class Details(val itemId: String) : Screen("Details") // for non-tab navigation
}

val tabScreens = listOf(Screen.Home, Screen.Colors, Screen.Typography, Screen.Fonts, Screen.Icons)