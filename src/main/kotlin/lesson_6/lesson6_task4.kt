package lesson_6

fun main() {
    val correctNumber = (1..9).random()
    var win = false
    var attempt = 5

    println("Угадайте число от 1 до 9. У вас $attempt попыток.")

    while (!win) {
        val number = readln().toInt()

        if (number != correctNumber && attempt != 1) {
            --attempt
            println("Неверно. Осталось попыток: $attempt")

        } else if (number == correctNumber) {
            win = true
            println("Верно. Это была великолепная игра!")
        } else print("Неверно. Было загадано число: $correctNumber")
    }
}
