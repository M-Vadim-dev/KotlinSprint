package lesson_9

fun main() {
    val ingredientsSet = mutableSetOf<String>()
    val count = 5

    println("Введите $count названий ингредиентов (каждый по отдельности):")

    for (i in 1..count) {
        val ingredient = readln().lowercase()
        ingredientsSet.add(ingredient.trim())
    }

    val sortedIngredients = ingredientsSet.sorted().toMutableList()

    val firstIngredient = sortedIngredients.removeAt(0).replaceFirstChar { it.uppercase() }
    sortedIngredients.add(0, firstIngredient)

    val resultIngredients = sortedIngredients.joinToString(", ")

    println("Отсортированный список ингредиентов: $resultIngredients")
}