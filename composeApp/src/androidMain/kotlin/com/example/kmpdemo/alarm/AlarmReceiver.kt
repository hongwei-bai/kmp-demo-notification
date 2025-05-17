package com.example.kmpdemo.alarm

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.kmpdemo.notification.NotificationLauncher

class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        context?.let {
            NotificationLauncher.notify(context, "111", "222")
        }
    }
}