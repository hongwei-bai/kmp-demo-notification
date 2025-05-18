package com.example.kmpdemo.alarm

actual object AlarmSetter {
    actual fun setAlarm(timestampMillis: Long, title: String, message: String) {
        println("AlarmSetter.setAlarm($timestampMillis)")
    }

    actual fun cancelAlarm(title: String, message: String) {
        println("AlarmSetter.cancelAlarm()")
    }
}