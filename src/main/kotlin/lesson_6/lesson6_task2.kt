package lesson_6

fun main() {
    println("Введите количество секунд для таймера:")
    val secondsInput = readln().toInt()

    Thread.sleep(secondsInput * 1000L)

    println("Прошло $secondsInput секунд.")
}

