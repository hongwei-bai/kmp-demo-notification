package com.example.kmpdemo.data

import com.example.kmpdemo.database.DatabaseHelper

class MyRepository(
    private val dbHelper: DatabaseHelper
) {
    fun test() {
        println("test run!")
    }

    fun insertUser(name: String, age: Int) {
        dbHelper.insert(1, name, age, "test student")
    }

    fun clearAllUsers() {
        dbHelper.clearAll()
    }

    fun getUserName(): String? {
        return dbHelper.getRecordById(1)?.name
    }
}