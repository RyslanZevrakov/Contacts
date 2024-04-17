package com.example.contacts

import android.app.Application

import com.example.data.MainDb

class App: Application() {
    val database by lazy { MainDb.createDataBase(this) }
}