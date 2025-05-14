package com.example.kmpdemo.database

import app.cash.sqldelight.db.SqlDriver

// NativeDriverFactory.kt
actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver {
        return NativeSqliteDriver(
            schema = AppDatabase.Schema,
            name = "app.db"
        )
    }
}