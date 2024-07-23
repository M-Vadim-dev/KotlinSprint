package lesson_5

fun main() {
    val winningNumbers = mutableListOf<Int>()
    val startRangeOfNumbers = 0
    val endRangeOfNumbers = 42

    while (winningNumbers.size < 3) {
        val number = (startRangeOfNumbers..endRangeOfNumbers).random()
        if (!winningNumbers.contains(number)) winningNumbers.add(number)
    }

    val userNumbers = listOf(
        readln().toInt(),
        readln().toInt(),
        readln().toInt()
    ).filter { it in startRangeOfNumbers..endRangeOfNumbers }.take(3).toSet()

    val matchedNumber = winningNumbers.intersect(userNumbers).size

    if (matchedNumber == 3) println("Вы угадали все числа и выиграли джекпот!")
    else if (matchedNumber == 2) println("Вы угадали два числа и получаете крупный приз!")
    else if (matchedNumber == 1) println("Вы угадали одно число. Вам выплачивается утешительный приз.")
    else println("Вы не угадали ни одного числа.")

    println("Выигрышные числа: $winningNumbers")
}