package com.example.cs455_termproject.database

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.cs455_termproject.element.Elements

@Database(entities = [ Elements::class ], version = 1, exportSchema = true)
abstract class ElementDatabase : RoomDatabase() {
    abstract fun elementDao(): ElementDao
}