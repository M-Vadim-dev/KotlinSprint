package org.example.lesson_5

fun main() {
    val numberOne = (1 until 10).random()
    val numberTwo = (1 until 10).random()

    print("Для входа в приложение нужно сложить два числа: $numberOne + $numberTwo = ")
    val result = readln().toInt()

    if (numberOne + numberTwo == result) println("Добро пожаловать!")
    else println("Доступ запрещен")
}