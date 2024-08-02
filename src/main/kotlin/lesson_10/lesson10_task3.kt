package lesson_10

fun main() {
    print("Введите длину пароля: ")
    val length = readln().toInt()
    println("Сгенерированный пароль: ${generatePassword(length)}")
}

fun generatePassword(length: Int): String {
    val digits = 0..9
    val specialChars = (32..47).map { it.toChar() }
    println(specialChars)
    var password = ""

    for (i in 0 until length) {
        val char = if (i % 2 == 0) digits.random()
        else specialChars.random()
        password += char
    }
    return password
}