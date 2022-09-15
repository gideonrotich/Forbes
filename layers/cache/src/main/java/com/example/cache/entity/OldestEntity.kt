package com.example.cache.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "oldest_table")
data class OldestEntity(
    @PrimaryKey(autoGenerate = false)
    val rank: Int,
    val finalWorth: Double,
    val personName: String,
    val city: String,
    val source: String,
    val industries: List<String>,
    val countryOfCitizenship: String,
    val squareImage: String,
    val bios: List<String>,
    val abouts: List<String>
)
