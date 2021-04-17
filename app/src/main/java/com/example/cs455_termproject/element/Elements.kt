package com.example.cs455_termproject.element

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Elements (
    @PrimaryKey val atomic_no: Int,
    val element_id: String,
    val eng_name: String,
    val lat_name: String,
    val year_discovered: Int,
    val atomic_weight: Float,
    val density: Float,
    val melting_point: Float,
    val boiling_point: Float,
    val period: Int,
    val atomic_radius: Float,
    val covalent_radius: Float,
    val vanderwaals_radius: Float
)