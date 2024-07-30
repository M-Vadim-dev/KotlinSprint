package lesson_8

fun main() {
    println("Введите количество ингредиентов: ")
    val count = readln().toInt()

    val ingredients = arrayOfNulls<String>(count)

    for (i in ingredients.indices) {
        println("Введите ингредиент ${i + 1}: ")
        ingredients[i] = readln()
    }

    println("Полученные ингредиенты: ${ingredients.joinToString(", ")}")
}
