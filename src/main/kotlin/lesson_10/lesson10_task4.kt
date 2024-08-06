package lesson_10

fun main() {
    var playerWins = 0

    do {
        if (playRound()) playerWins++
        print("Хотите бросить кости еще раз?\nВведите Да или Нет: ")
    } while (readln().equals("да", ignoreCase = true))

    println("Количество выигрышных партий игроком: $playerWins")
}

fun rollGameDice(): Int = (1..6).random()

fun playRound(): Boolean {
    val playerRoll = rollGameDice()
    val computerRoll = rollGameDice()
    println("Игрок бросает кости и получает: $playerRoll")
    println("Компьютер бросает кости и получает: $computerRoll")

    return if (playerRoll > computerRoll) {
        println("Победило человечество!")
        true
    } else if (computerRoll > playerRoll) {
        println("Победила машина!")
        false
    } else {
        println("Ничья!")
        false
    }
}