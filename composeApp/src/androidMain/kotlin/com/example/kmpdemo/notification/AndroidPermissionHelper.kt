package com.example.kmpdemo.notification

import android.app.Activity
import android.app.AlarmManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import android.provider.Settings
import androidx.appcompat.app.AlertDialog

object AndroidPermissionHelper {
    private const val NOTIFICATION_PERMISSION_REQUEST_CODE = 1001

    fun hasNotificationPermission(activity: Activity): Boolean {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            ContextCompat.checkSelfPermission(
                activity,
                android.Manifest.permission.POST_NOTIFICATIONS
            ) == PackageManager.PERMISSION_GRANTED
        } else {
            true // Automatically granted on lower versions
        }
    }

    fun requestNotificationPermission(activity: Activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            ActivityCompat.requestPermissions(
                activity,
                arrayOf(android.Manifest.permission.POST_NOTIFICATIONS),
                NOTIFICATION_PERMISSION_REQUEST_CODE
            )
        }
    }

    /**
     * Checks if the app can schedule exact alarms.
     * Returns true if allowed or API < 33.
     */
    fun hasExactAlarmPermission(context: Context): Boolean {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
            alarmManager.canScheduleExactAlarms()
        } else {
            true
        }
    }

    /**
     * Shows a dialog to the user explaining why exact alarm permission is needed,
     * then directs user to the system settings screen to grant it.
     */
    fun promptExactAlarmPermission(activity: Activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            AlertDialog.Builder(activity)
                .setTitle("Allow Exact Alarm Permission")
                .setMessage("To ensure notifications work correctly even when the app is in the background, please allow exact alarms.")
                .setPositiveButton("Go to Settings") { _, _ ->
                    try {
                        val intent = Intent(Settings.ACTION_REQUEST_SCHEDULE_EXACT_ALARM)
                        activity.startActivity(intent)
                    } catch (e: Exception) {
                        // Fallback: open app details settings
                        val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
                        intent.data = android.net.Uri.parse("package:" + activity.packageName)
                        activity.startActivity(intent)
                    }
                }
                .setNegativeButton("Cancel", null)
                .show()
        }
    }
}
