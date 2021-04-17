package com.example.cs455_termproject.database

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.cs455_termproject.element.Elements

@Database(entities = [ Elements::class ], version = 1)
abstract class ElementDatabase : RoomDatabase() {
    companion object {
        fun get(application: Application) : ElementDatabase {
            return Room.databaseBuilder(application, ElementDatabase::class.java, "element")
                    .build()
        }
    }
}