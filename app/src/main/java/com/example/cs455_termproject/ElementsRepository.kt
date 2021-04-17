package com.example.cs455_termproject

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.Room
import com.example.cs455_termproject.database.ElementDao
import com.example.cs455_termproject.database.ElementDatabase
import com.example.cs455_termproject.element.Elements

private const val DATABASE_NAME = "elements-database"

class ElementsRepository private constructor(context: Context) {

    private val  database : ElementDatabase = Room.databaseBuilder(
        context.applicationContext,
        ElementDatabase::class.java,
        DATABASE_NAME
    ).createFromAsset("database/elements.db")
        .build()
    private val elementDao = database.elementDao()

    fun getElements(): LiveData<List<Elements>> = elementDao.getElements()

    companion object{
        private var INSTANCE: ElementsRepository? = null

        fun initialize(context: Context) {
            if (INSTANCE == null) {
                INSTANCE = ElementsRepository(context)
            }
        }
        fun get(): ElementsRepository {
            return INSTANCE ?:
            throw IllegalStateException("CrimeRepositry must be initialized")
        }
    }
}