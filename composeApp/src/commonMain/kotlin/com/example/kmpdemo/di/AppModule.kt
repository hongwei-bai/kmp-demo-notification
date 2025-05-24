package com.example.kmpdemo.di

import com.example.kmpdemo.data.MyRepository
import org.koin.dsl.module
import com.example.kmpdemo.database.DatabaseHelper
import com.example.kmpdemo.domain.SomeUseCase
import com.example.kmpdemo.nav.NavViewModel
import com.example.kmpdemo.ui.CounterViewModel

val commonModule = module {
    single { DatabaseHelper(get()) }
    single { MyRepository(get()) }
    single { SomeUseCase(get()) }
    single  { CounterViewModel(get()) }

    factory { NavViewModel() }
}