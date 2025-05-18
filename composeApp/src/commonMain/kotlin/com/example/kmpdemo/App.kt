package com.example.kmpdemo

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kmpdemo.alarm.AlarmSetter
import com.example.kmpdemo.notification.Notification.showNotification
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import kmp_compose_demo.composeapp.generated.resources.Res
import kmp_compose_demo.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
        val lifecycle = remember { _root_ide_package_.com.example.kmpdemo.lifecycle.AppLifecycle() }
        LaunchedEffect(Unit) {
            lifecycle.observeLifecycle(
                onEnterForeground = {
                    println("🌞 App entered foreground")
                },
                onEnterBackground = {
                    println("🌚 App entered background")
                }
            )
        }

        var showContent by remember { mutableStateOf(false) }
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Spacer(Modifier.height(128.dp))
            Button(
                onClick = {
                    showNotification("Hello Compose!", "Hello Compose!")
                    showContent = !showContent
                }) {
                Text("Click me!")
            }
            AnimatedVisibility(showContent) {
                val greeting = remember { Greeting().greet() }
                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Compose: $greeting")
                }
            }

            Spacer(Modifier.height(24.dp))
            Button(
                onClick = {
                    AlarmSetter.setAlarm(2000, "Delayed alarm", "It's ringing!!")
                }) {
                Text("Alarm in 2 seconds")
            }

            Spacer(Modifier.height(24.dp))
            Button(
                onClick = {
                    AlarmSetter.cancelAlarm("Delayed alarm", "It's ringing!!")
                }) {
                Text("Cancel alarm")
            }
        }
    }
}