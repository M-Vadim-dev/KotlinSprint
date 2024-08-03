package lesson_10

fun main() {
    var playerWins = 0

    while (true) {
        playRound()
        print("Хотите бросить кости еще раз?\nВведите Да или Нет: ")
        val continueGame = readln()

        if (continueGame.equals("да", ignoreCase = true)) {
            playerWins++
        } else {
            println("Количество выигрышных партий игроком: $playerWins")
            break
        }
    }
}

fun rollGameDice(): Int = (1..6).random()

fun playRound() {
    val playerRoll = rollGameDice()
    val computerRoll = rollGameDice()
    println("Игрок бросает кости и получает: $playerRoll")
    println("Компьютер бросает кости и получает: $computerRoll")

    if (playerRoll > computerRoll)
        println("Победило человечество!")
    else if (computerRoll > playerRoll)
        println("Победила машина!")
    else println("Ничья!")
}