package com.example.kmpdemo.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun DetailsScreen(itemId: String, onBack: () -> Unit) {
    Column {
        Text("Details for item: $itemId")
        Button(onClick = onBack) {
            Text("Back")
        }
    }
}