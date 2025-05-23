package com.example.kmpdemo.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import kmp_compose_demo.composeapp.generated.resources.Res
import kmp_compose_demo.composeapp.generated.resources.exo2_medium
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.Font

@OptIn(ExperimentalResourceApi::class)
@Composable
fun TekoFontFamily() = FontFamily(
    Font(Res.font.exo2_medium, weight = FontWeight.Light),
    Font(Res.font.exo2_medium, weight = FontWeight.Normal),
    Font(Res.font.exo2_medium, weight = FontWeight.Medium),
    Font(Res.font.exo2_medium, weight = FontWeight.SemiBold),
    Font(Res.font.exo2_medium, weight = FontWeight.Bold)
)