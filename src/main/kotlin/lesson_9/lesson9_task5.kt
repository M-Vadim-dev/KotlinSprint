package lesson_9

fun main() {
    val ingredientsSet = mutableSetOf<String>()
    val count = 5

    println("Введите $count названий ингредиентов (каждый по отдельности):")

    for (i in 1..count) {
        val ingredient = readln().lowercase()
        ingredientsSet.add(ingredient.trim())
    }

    val resultIngredients = ingredientsSet.sorted().joinToString(", ").replaceFirstChar { it.uppercase() }

    println("Отсортированный список ингредиентов: $resultIngredients")
}