package lesson_3

fun main() {
    val userName = "Ivan"
    val time = 16
    greeting(userName, time)
}

fun greeting(userName: String, time: Int): String {
    if (time in 5..11) println("Доброе утро! $userName")
    else if (time in 12..17) println("Добрый день! $userName")
    else if (time in 18..23) println("Добрый вечер! $userName")
    else println("Доброй ночи! $userName")
    return userName
}

