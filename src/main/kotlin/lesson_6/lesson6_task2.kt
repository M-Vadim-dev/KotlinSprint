package lesson_6

fun main() {
    println("Введите количество секунд для таймера:")
    val secondsInput = readln().toInt()
    var secondsPassed = 0
    var pause = false

    println("Для паузы таймера нажмите Enter.")

    while (secondsPassed < secondsInput) {
        if (!pause) {
            Thread.sleep(1000)
            secondsPassed++

            // Проверка ввода для приостановки таймера
            if (System.`in`.available() > 0) {
                readln()
                pause = true
                println("Таймер приостановлен. Нажмите Enter для продолжения.")
            }
        } else {
            // Проверка ввода для продолжения
            if (System.`in`.available() > 0) {
                readln()
                pause = false
                println("Таймер продолжен.")
            }
        }
    }
    println("Прошло $secondsInput секунд.")
}

