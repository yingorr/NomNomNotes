package com.example.nomnomnotes

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class RecipeViewModel : ViewModel() {

    var recipes = mutableStateListOf<Recipe>()
        private set

    fun addRecipe(name: String, ingredients: String) {
        recipes.add(Recipe(name, ingredients))
    }
}