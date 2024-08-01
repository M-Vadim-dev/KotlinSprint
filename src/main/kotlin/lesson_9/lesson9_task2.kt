package lesson_9

fun main() {
    val ingredients = mutableListOf("мука", "яйцо", "сахар")

    println("В рецепте есть базовые ингредиенты: ${ingredients.joinToString(", ")}")

    println("Желаете добавить еще? (да/нет)")
    val response = readln().lowercase()

    if (response == "да") {
        println("Какой ингредиент вы хотите добавить?")
        ingredients.add(readln().lowercase())
    } else return

    println("Теперь в рецепте есть следующие ингредиенты: ${ingredients.joinToString(", ")}")
}