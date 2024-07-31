package lesson_9

fun main() {
    val ingredientsList = readln().split(", ")
    val sortedIngredients = ingredientsList.sorted()

    println("Отсортированные ингредиенты:")
    for (ingredient in sortedIngredients) {
        println(ingredient)
    }
}