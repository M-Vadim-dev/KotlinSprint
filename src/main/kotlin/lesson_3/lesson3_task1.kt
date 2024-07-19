package lesson_3

fun main() {
    val userName = "Ivan"
    val time = 16
    greeting(userName, time)
}

fun greeting(userName: String, time: Int): String {
    val morningStart = 6
    val morningEnd = 11
    val dayStart = 12
    val dayEnd = 17
    val eveningStart = 18
    val eveningEnd = 23
    when (time) {
        in morningStart..morningEnd -> println("Доброе утро! $userName")
        in dayStart..dayEnd -> println("Добрый день! $userName")
        in eveningStart..eveningEnd -> println("Добрый вечер! $userName")
        else -> println("Доброй ночи! $userName")
    }
    return userName
}
