package com.example.nomnomnotes
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Recipe(
    @PrimaryKey(autoGenerate = true)
    val id: String = 0.toString(),
    val name: String
)