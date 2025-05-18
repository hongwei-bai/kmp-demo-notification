package com.example.kmpdemo.alarm

import android.annotation.SuppressLint
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.annotation.RequiresPermission
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.ZoneId
import java.util.Calendar


class AlarmHelper {
    @RequiresApi(Build.VERSION_CODES.O)
    fun setAlarm(context: Context, dateStr: String, timeStr: String) {
        val ldt = LocalDateTime.of(LocalDate.parse(dateStr), LocalTime.parse(timeStr))
        val instant: Instant = ldt.atZone(ZoneId.systemDefault()).toInstant()
        AlarmHelper().setAlarm(context, instant)
    }

    /**
     * Schedule alarm using a timestamp in milliseconds.
     */
    @SuppressLint("ScheduleExactAlarm")
    @RequiresPermission(android.Manifest.permission.SCHEDULE_EXACT_ALARM)
    fun setAlarm(context: Context, timestampMillis: Long) {
        val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        val pendingIntent = createAlarmPendingIntent(context)

        alarmManager.setExactAndAllowWhileIdle(
            AlarmManager.RTC_WAKEUP,
            timestampMillis,
            pendingIntent
        )
    }

    /**
     * Cancel any existing alarm with the predefined request code.
     */
    fun cancelAlarm(context: Context) {
        val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        val pendingIntent = createAlarmPendingIntent(context)
        alarmManager.cancel(pendingIntent)
    }

    /**
     * Create a consistent PendingIntent used for setting and canceling alarms.
     */
    private fun createAlarmPendingIntent(context: Context): PendingIntent {
        val intent = Intent(context, AlarmReceiver::class.java)
        return PendingIntent.getBroadcast(
            context,
            ALARM_REQUEST_CODE,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun setAlarm(context: Context, time: Instant) {
        with(context) {
            val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
            val alarmIntent = Intent(this, AlarmReceiver::class.java)
            val pendingIntent = PendingIntent.getBroadcast(
                this, 0, alarmIntent,
                PendingIntent.FLAG_IMMUTABLE
            )

            // Set the time for the alarm (replace with your preferred time and date)
            val calendar = Calendar.getInstance()
            val ldt = LocalDateTime.ofInstant(time, ZoneId.systemDefault())
            calendar.set(Calendar.HOUR_OF_DAY, ldt.hour)
            calendar.set(Calendar.MINUTE, ldt.minute)
            calendar.set(Calendar.SECOND, ldt.second)

            // Schedule the alarm
            try {
                alarmManager.setExact(AlarmManager.RTC_WAKEUP, calendar.timeInMillis, pendingIntent)
            } catch (e: SecurityException) {
                Log.e(TAG, "SecurityException: ${e.localizedMessage}")
            }
        }
    }

    companion object {
        private val TAG = AlarmHelper::class.simpleName
        private const val ALARM_REQUEST_CODE = 1001
    }
}