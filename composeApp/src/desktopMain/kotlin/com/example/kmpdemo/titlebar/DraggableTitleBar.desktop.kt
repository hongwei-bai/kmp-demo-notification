package com.example.kmpdemo.titlebar

// desktopMain
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kmpdemo.LocalWindow

@Composable
actual fun DraggableTitleBar() {
    val window = LocalWindow.current

    var initialMouseX by remember { mutableStateOf(0) }
    var initialMouseY by remember { mutableStateOf(0) }

    var initialWindowX by remember { mutableStateOf(0) }
    var initialWindowY by remember { mutableStateOf(0) }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(MaterialTheme.colors.primary)
            .pointerInput(Unit) {
                detectDragGestures(
                    onDragStart = {
                        val mouseLoc = java.awt.MouseInfo.getPointerInfo().location
                        initialMouseX = mouseLoc.x
                        initialMouseY = mouseLoc.y

                        val windowLoc = window.location
                        initialWindowX = windowLoc.x
                        initialWindowY = windowLoc.y
                    },
                    onDrag = { change, _ ->
                        change.consume()
                        val currentMouseLoc = java.awt.MouseInfo.getPointerInfo().location

                        val dx = currentMouseLoc.x - initialMouseX
                        val dy = currentMouseLoc.y - initialMouseY

                        window.setLocation(
                            initialWindowX + dx,
                            initialWindowY + dy
                        )
                    }
                )
            },
        contentAlignment = Alignment.Center
    ) {
        // Close Button on the left
        Box(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(start = 12.dp)
                .clickable { window.dispose() },
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "✕",
                color = MaterialTheme.colors.onPrimary,
                fontSize = 18.sp
            )
        }

        // Title in the center
        Text(
            text = "My App",
            color = MaterialTheme.colors.onPrimary,
            fontSize = 16.sp,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}
