package com.example.kmpdemo

import com.example.kmpdemo.database.DatabaseDriverFactory
import com.example.kmpdemo.database.DatabaseHelper
import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion

    // Add database components here
    val driverFactory = DatabaseDriverFactory()
    val databaseHelper = DatabaseHelper(driverFactory)
}

actual fun getPlatform(): Platform = IOSPlatform()

// Helper extension to access database from anywhere
fun getDatabaseHelper(): DatabaseHelper {
    return (getPlatform() as IOSPlatform).databaseHelper
}