package lesson_6

fun main() {
    println("Введите количество секунд для таймера:")
    var secondsInput = readln().toInt()
    var pause = false

    println("Для паузы таймера нажмите Enter.")

    while (secondsInput > 0) {
        if (!pause) {
            println("Осталось $secondsInput секунд")
            Thread.sleep(1000)
            secondsInput--

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
    println("Таймер завершен!")
}

