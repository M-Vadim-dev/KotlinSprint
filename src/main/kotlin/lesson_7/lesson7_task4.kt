package lesson_7

fun main() {
    println("Введите количество секунд для таймера:")
    var secondsInput = readln().toInt()
    val range = 1..secondsInput

    for (i in range) {
        println("Осталось секунд: ${secondsInput--}")
        Thread.sleep(1000)
    }
    println("Время вышло!")
}