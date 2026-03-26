package com.example.nomnomnotes
import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface RecipeDao {

    // Recipe
    @Insert
    suspend fun insertRecipe(recipe: Recipe): Long

    @Query("SELECT * FROM Recipe")
    fun getAllRecipes(): Flow<List<Recipe>>

    // Ingredient
    @Insert
    suspend fun insertIngredients(ingredients: List<Ingredient>)

    @Query("SELECT * FROM Ingredient WHERE recipeId = :recipeId")
    fun getIngredientsForRecipe(recipeId: Int): Flow<List<Ingredient>>

    // Shopping
    @Insert
    suspend fun insertShoppingItems(items: List<ShoppingItem>)

    @Query("SELECT * FROM ShoppingItem")
    fun getAllShoppingItems(): Flow<List<ShoppingItem>>

    @Update
    suspend fun updateShoppingItem(item: ShoppingItem)

    @Delete
    suspend fun deleteShoppingItem(item: ShoppingItem)
}