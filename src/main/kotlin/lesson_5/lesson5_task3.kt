package lesson_5

fun main() {
    val winningNumber1 = 14
    val winningNumber2 = 31

    println("Введите первое число от 0 до 42:")
    val userNumber1 = readLine()?.toIntOrNull()

    println("Введите второе число от 0 до 42:")
    val userNumber2 = readLine()?.toIntOrNull()

    if ((userNumber1 == winningNumber1 && userNumber2 == winningNumber2) ||
        (userNumber1 == winningNumber2 && userNumber2 == winningNumber1)
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((userNumber1 == winningNumber1 || userNumber1 == winningNumber2) ||
        (userNumber2 == winningNumber1 || userNumber2 == winningNumber2)
    ) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

    println("Правильные числа: $winningNumber1, $winningNumber2")
}
