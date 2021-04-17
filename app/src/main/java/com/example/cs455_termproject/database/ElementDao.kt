package com.example.cs455_termproject.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.example.cs455_termproject.element.Elements

@Dao
interface ElementDao {

    @Query("SELECT * from Elements")
    fun getElements(): LiveData<List<Elements>>

}