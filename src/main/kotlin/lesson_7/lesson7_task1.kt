package lesson_7

fun main() {
    val letters = 'a'..'z'
    val capitalizeLetters = 'A'..'Z'
    val digits = '0'..'9'
    val range = 1..6

    val combined = letters + digits + capitalizeLetters
    var randomPassword = ""

    for (i in range) {
        val randomIndex = (Math.random() * combined.size).toInt()
        randomPassword += combined[randomIndex]
    }
    println("Сгенерированный пароль: $randomPassword")
}
