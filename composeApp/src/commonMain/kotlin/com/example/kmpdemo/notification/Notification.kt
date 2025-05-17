package com.example.kmpdemo.notification

expect object Notification {
    fun showNotification(title: String, message: String)
}