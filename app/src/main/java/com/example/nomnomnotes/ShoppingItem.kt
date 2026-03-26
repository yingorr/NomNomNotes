package com.example.nomnomnotes
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ShoppingItem(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val isChecked: Boolean = false,
    val recipeId: Int? = null
)