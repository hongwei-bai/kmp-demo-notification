package com.example.kmpdemo.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.kmpdemo.domain.SomeUseCase

@Composable
fun SettingsScreen(onBack: () -> Unit) {
    Column {
        Text("Settings Screen")
        Button(onClick = onBack) {
            Text("Back")
        }
    }
}