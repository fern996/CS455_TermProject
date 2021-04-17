package com.example.cs455_termproject.database

import androidx.room.Dao

@Dao
interface ElementDao {

    fun insertLocation(list : List)

}