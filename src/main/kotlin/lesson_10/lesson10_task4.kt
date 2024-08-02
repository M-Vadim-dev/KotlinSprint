package lesson_10

fun main() {
    var playerWins = 0
    playRound()

    while (true) {
        print("Хотите бросить кости еще раз?\nВведите Да или Нет: ")
        val continueGame = readln().lowercase()

        if (continueGame == "да") {
            playerWins++
            playRound()
        } else {
            println("Количество выигрышных партий игроком: $playerWins")
            break
        }
    }
}

fun rollGameDice(): Int = (1..6).random()

fun playRound(): Int {
    val playerRoll = rollGameDice()
    val computerRoll = rollGameDice()
    println("Игрок бросает кости и получает: $playerRoll")
    println("Компьютер бросает кости и получает: $computerRoll")

    if (playerRoll > computerRoll) {
        println("Победило человечество!")
        return 1
    } else if (computerRoll > playerRoll) {
        println("Победила машина!")
        return 0
    } else {
        println("Ничья!")
        return 0
    }
}