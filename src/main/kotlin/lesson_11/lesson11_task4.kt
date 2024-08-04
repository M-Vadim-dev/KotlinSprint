package lesson_11

class RecipeCategory(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
)

class Recipe(
    val id: Int,
    val name: String,
    val categoryId: Int,
    val instructions: String,
    val ingredients: List<Ingredient>,
    val imageUrl: String,
    val inFavorites: Boolean = false,
)

class Ingredient(
    val id: Int,
    val name: String,
    val quantity: String,
    val recipeId: Int,
)
