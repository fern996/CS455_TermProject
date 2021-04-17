package com.example.cs455_termproject

import android.app.Application

class ElementsIntentApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        ElementsRepository.initialize(this)
    }
}