package lesson_5

import java.time.LocalDateTime

fun main() {
    val dateTime = LocalDateTime.now().toString()
    val yearToday = dateTime.substring(0, 4).toInt()

    print("Введите год рождения: ")
    val userBirthYear = readln().toInt()
    val differenceYear = yearToday - userBirthYear

    if (differenceYear >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }
    if (differenceYear < AGE_OF_MAJORITY) {
        println("Вернуться на главный экран")
    }
}

const val AGE_OF_MAJORITY = 18