package lesson_10

fun main() {
    val playerRoll = rollDice()
    val computerRoll = rollDice()

    println("Игрок бросает кости и получает: $playerRoll")
    println("Компьютер бросает кости и получает: $computerRoll")

    when {
        playerRoll > computerRoll -> println("Победило человечество!")
        computerRoll > playerRoll -> println("Победила машина!")
        else -> println("Ничья!")
    }
}

const val MIN_DICE_VALUE = 1
const val MAX_DICE_VALUE = 6

fun rollDice(): Int {
    return (MIN_DICE_VALUE..MAX_DICE_VALUE).random()
}