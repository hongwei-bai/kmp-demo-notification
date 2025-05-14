package com.example.kmpdemo.database

import app.cash.sqldelight.db.SqlDriver

class DatabaseHelper(driverFactory: DatabaseDriverFactory) {
    private val database: AppDatabase
    private val driver: SqlDriver

    init {
        driver = driverFactory.createDriver()
        database = AppDatabase(driver)
    }

    suspend fun createItem(title: String) {
        database.appDatabaseQueries.createItem(
            title = title,
            created_at = System.currentTimeMillis()
        )
    }

    fun getAllItems(): List<Item> {
        return database.appDatabaseQueries.getAllItems()
            .executeAsList()
    }

    suspend fun deleteItem(id: Long) {
        database.appDatabaseQueries.deleteItem(id)
    }
}