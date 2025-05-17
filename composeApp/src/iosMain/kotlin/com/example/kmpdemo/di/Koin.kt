package com.example.kmpdemo.di

import org.koin.core.context.startKoin
import com.example.kmpdemo.database.DatabaseDriverFactory
import org.koin.dsl.module

fun initKoinIos(driverFactory: DatabaseDriverFactory) {
    startKoin {
        modules(
            module {
                single { driverFactory }
            },
            commonModule
        )
    }
}