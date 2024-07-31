package lesson_9

fun main() {
    val ingredients = listOf("морковь", "лук", "картофель", "мясо", "свекла", "капуста")

    println("В рецепте есть следующие ингредиенты: ${ingredients.joinToString(", ")}")

    for (ingredient in ingredients) {
        println(ingredient)
    }
}