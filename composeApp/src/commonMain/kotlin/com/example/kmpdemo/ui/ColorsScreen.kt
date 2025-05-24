package com.example.kmpdemo.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ColorsScreen() {
    val colors = MaterialTheme.colors

    val colorPairs = listOf(
        "Primary" to (colors.primary to colors.onPrimary),
        "PrimaryVariant" to (colors.primaryVariant to colors.onPrimary),
        "Secondary" to (colors.secondary to colors.onSecondary),
        "SecondaryVariant" to (colors.secondaryVariant to colors.onSecondary),
        "Background" to (colors.background to colors.onBackground),
        "Surface" to (colors.surface to colors.onSurface),
        "Error" to (colors.error to colors.onError)
    )

    Column(modifier = Modifier.fillMaxSize()) {
        colorPairs.forEach { (label, pair) ->
            val (bg, fg) = pair
            ColorRow(label, bg, fg)
        }
    }
}

@Composable
private fun ColorRow(label: String, bgColor: Color, textColor: Color) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(bgColor)
            .padding(start = 16.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        Text(
            text = "$label/on$label",
            color = textColor,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
    }
}