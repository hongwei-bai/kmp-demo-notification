package com.example.kmpdemo.alarm

import android.annotation.SuppressLint

@SuppressLint("ScheduleExactAlarm")
actual object AlarmSetter {
    actual fun setAlarm(timestampMillis: Long, title: String, message: String) {
        val koin = org.koin.core.context.GlobalContext.getOrNull()
        if (koin != null) {
            val alarmHelper: AlarmHelper = koin.get()
            alarmHelper.setAlarm(timestampMillis, title, message)
        }
    }

    actual fun cancelAlarm(title: String, message: String) {
        val koin = org.koin.core.context.GlobalContext.getOrNull()
        if (koin != null) {
            val alarmHelper: AlarmHelper = koin.get()
            alarmHelper.cancelAlarm(title, message)
        }
    }
}