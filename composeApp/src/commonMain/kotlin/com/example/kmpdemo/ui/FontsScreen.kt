package com.example.kmpdemo.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kmp_compose_demo.composeapp.generated.resources.*
import org.jetbrains.compose.resources.Font

@Composable
fun FontsScreen() {
    val fontFamilies = listOf(
        "B612 Regular" to FontFamily(Font(Res.font.b612_regular)),
        "Exo2 Medium" to FontFamily(Font(Res.font.exo2_medium)),
        "F16 PFont" to FontFamily(Font(Res.font.f16_pfont)),
        "Futura Medium BT" to FontFamily(Font(Res.font.futura_medium_bt)),
        "Hornet Display Regular" to FontFamily(Font(Res.font.hornetdisplay_regular)),
        "JetBrainsMono-Medium" to FontFamily(Font(Res.font.jetbrainsmono_medium))
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        val timeDisplaySample = "2:38:47"

        fontFamilies.forEach { (label, fontFamily) ->
            FontFamilyRow(label = label, fontFamily = fontFamily, time = timeDisplaySample)
        }
    }
}


@Composable
private fun FontFamilyRow(label: String, fontFamily: FontFamily, time: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .heightIn(min = 48.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        Text(
            text = "$label  $time",
            style = TextStyle(
                fontSize = 36.sp,
                fontFamily = fontFamily
            )
        )
    }
}