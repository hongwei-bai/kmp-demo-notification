package com.example.kmpdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.kmpdemo.domain.SomeUseCase
import com.example.kmpdemo.permission.AndroidPermissionHelper
import org.koin.android.ext.android.get

class MainActivity : ComponentActivity() {
    private val someUseCase = get<SomeUseCase>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (!AndroidPermissionHelper.hasNotificationPermission(this)) {
            AndroidPermissionHelper.requestNotificationPermission(this)
        }

        if (!AndroidPermissionHelper.hasExactAlarmPermission(this)) {
            AndroidPermissionHelper.promptExactAlarmPermission(this)
        }

        setContent {
            App(someUseCase)
        }
    }
}
