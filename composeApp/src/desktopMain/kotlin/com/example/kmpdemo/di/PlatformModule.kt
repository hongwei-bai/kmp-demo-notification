package com.example.kmpdemo.di

import com.example.kmpdemo.database.DatabaseDriverFactory
import com.example.kmpdemo.database.DatabaseHelper
import org.koin.dsl.module

val platformModule = module {
    single { DatabaseDriverFactory() }
    single { DatabaseHelper(get()) }
}