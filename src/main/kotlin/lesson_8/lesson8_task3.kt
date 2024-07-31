package lesson_8

fun main() {
    val ingredients = arrayOf("морковь", "лук", "картофель", "мясо", "свекла", "капуста")

    println("Введите ингредиент, который хотите найти: ")
    val searchIngredient = readln().lowercase()

    if (searchIngredient in ingredients) println("Ингредиент $searchIngredient в рецепте есть")
    else println("Такого ингредиента в рецепте нет")
}