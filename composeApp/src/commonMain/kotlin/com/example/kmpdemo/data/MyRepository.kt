package com.example.kmpdemo.data

import com.example.kmpdemo.database.DatabaseHelper

class MyRepository(
    private val dbHelper: DatabaseHelper
) {
    fun test() {
        // use dbHelper here
    }
}