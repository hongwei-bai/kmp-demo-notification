package com.example.kmpdemo.di

import org.koin.dsl.module
import com.example.kmpdemo.database.DatabaseDriverFactory
import android.content.Context
import com.example.kmpdemo.alarm.AlarmHelper
import com.example.kmpdemo.database.DatabaseHelper

fun platformModule(context: Context) = module {
    single { DatabaseDriverFactory(context) }
    single { DatabaseHelper(get()) }
    single<Context> { context.applicationContext }
    single { AlarmHelper(get()) }
}