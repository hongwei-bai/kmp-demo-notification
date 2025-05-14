package com.example.kmpdemo

import android.app.Application
import com.example.kmpdemo.database.DatabaseDriverFactory
import com.example.kmpdemo.database.DatabaseHelper

class AndroidApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        val driverFactory = DatabaseDriverFactory(applicationContext)
        val databaseHelper = DatabaseHelper(driverFactory)
    }
}