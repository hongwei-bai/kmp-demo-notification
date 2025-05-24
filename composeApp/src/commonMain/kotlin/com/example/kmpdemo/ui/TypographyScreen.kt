package com.example.kmpdemo.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

@Composable
fun TypographyScreen() {
    val typography = MaterialTheme.typography
    val scrollState = rememberScrollState()

    val samples = listOf(
        "h1" to typography.h1,
        "h2" to typography.h2,
        "h3" to typography.h3,
        "h4" to typography.h4,
        "h5" to typography.h5,
        "h6" to typography.h6,
        "subtitle1" to typography.subtitle1,
        "subtitle2" to typography.subtitle2,
        "body1" to typography.body1,
        "body2" to typography.body2,
        "button" to typography.button,
        "caption" to typography.caption,
        "overline" to typography.overline,
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp)
    ) {
        samples.forEach { (name, style) ->
            TypographyPreview(name = name, style = style)
            Spacer(modifier = Modifier.height(12.dp))
        }
    }
}

@Composable
fun TypographyPreview(name: String, style: TextStyle) {
    Column {
        Text(text = name, style = MaterialTheme.typography.caption)
        Text(
            text = name,
            style = style
        )
    }
}