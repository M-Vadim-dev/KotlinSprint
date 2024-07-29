package lesson_7

import kotlin.random.Random

fun main() {
    val minRange = 1000
    val maxRange = 9999

    for (attempt in 1..Int.MAX_VALUE) {   // бесконечное количество попыток
        val verificationCode = Random.nextInt(minRange, maxRange)
        println("Ваш код авторизации: $verificationCode")

        print("Введите код для авторизации: ")
        val userInput = readln().toInt()

        if (userInput == verificationCode) {
            println("Добро пожаловать!")
            break
        } else println("Неверный код. Попробуйте еще раз.")
    }
}