package lesson_8

fun main() {
    val ingredients = arrayOf("морковь", "лук", "картофель", "мясо", "свекла", "капуста")
    println("Список ингредиентов: ${ingredients.joinToString(", ")}")

    println("Введите ингредиент, который хотите заменить: ")
    val ingredientReplace = readln().lowercase()

    val index = ingredients.indexOf(ingredientReplace)
    if (index == -1) println("Такого ингредиента в списке нет.")
    else {
        println("Введите новый ингредиент: ")
        val newIngredient = readln().lowercase()

        val updateIngredients = ingredients.map {
            if (it == ingredientReplace) newIngredient
            else it
        }
        println("Готово! Вы сохранили следующий список: ${updateIngredients.joinToString(", ")}")
    }
}