package com.example.kmpdemo

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kmpdemo.alarm.AlarmSetter
import com.example.kmpdemo.domain.SomeUseCase
import com.example.kmpdemo.notification.Notification.showNotification
import com.example.kmpdemo.ui.CounterViewModel
import com.example.kmpdemo.ui.theme.MyAppTheme
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import kmp_compose_demo.composeapp.generated.resources.Res
import kmp_compose_demo.composeapp.generated.resources.compose_multiplatform
import org.koin.mp.KoinPlatform.getKoin

@Composable
@Preview
fun App(useCase: SomeUseCase) {
    val viewModel: CounterViewModel = getKoin().get()
    MyAppTheme {
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
        var message by remember { mutableStateOf("") }
        val count by viewModel.count.collectAsState(0)

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

            Spacer(Modifier.height(8.dp))
            Row {
                Button(
                    onClick = {
                        AlarmSetter.setAlarm(2000, "Delayed alarm", "It's ringing!!")
                        message = "Set delayed alarm"
                    }) {
                    Text("Alarm in 2s")
                }

                Spacer(Modifier.width(8.dp))
                Button(
                    onClick = {
                        AlarmSetter.cancelAlarm("Delayed alarm", "It's ringing!!")
                        message = "Alarm cancelled"
                    }) {
                    Text("Cancel alarm")
                }
            }

            Spacer(Modifier.height(8.dp))
            Row {
                Button(
                    onClick = {
                        useCase.addUser("Mike", 18)
                        message = "user Mike added."
                    }) {
                    Text("Add user")
                }

                Spacer(Modifier.width(8.dp))
                Button(
                    onClick = {
                        message = "user name is: ${useCase.getUserName()}"
                    }) {
                    Text("Get")
                }

                Spacer(Modifier.width(8.dp))
                Button(
                    onClick = {
                        useCase.clearAllUsers()
                        message = "user cleared"
                    }) {
                    Text("Clear")
                }
            }

            Spacer(Modifier.height(8.dp))
            Text(text = message)

            Row {
                Button(
                    onClick = {
                        viewModel.increment()
                    }) {
                    Text("+1")
                }

                Spacer(Modifier.width(8.dp))
                Button(
                    onClick = {
                        viewModel.decrement()
                    }) {
                    Text("-1")
                }
            }

            Spacer(Modifier.height(8.dp))
            Text(text = count.toString())
        }
    }
}