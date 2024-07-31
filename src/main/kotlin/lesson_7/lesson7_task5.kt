package lesson_7

fun main() {
    val letters = 'a'..'z'
    val capitalizeLetters = 'A'..'Z'
    val digits = '0'..'9'
    var rangeInput: Int
    val minPasswordLength = 6

    do {
        print("Введите длину пароля (не менее 6 символов): ")
        rangeInput = readln().toInt()
        if (rangeInput < minPasswordLength) {
            println("Ошибка: Длина пароля должна быть не менее 6 символов!")
        }
    } while (rangeInput < minPasswordLength)

    val combined = letters + digits + capitalizeLetters
    var randomPassword = ""

    //обязательные символы
    randomPassword += letters.random()
    randomPassword += capitalizeLetters.random()
    randomPassword += digits.random()

    val startIndex = 3
    for (i in startIndex..rangeInput) {
        val randomIndex = (Math.random() * combined.size).toInt()
        randomPassword += combined[randomIndex]
    }
    //перемешиваем символы
    randomPassword = randomPassword.toList().shuffled().joinToString("")

    println("Сгенерированный пароль: $randomPassword")
}