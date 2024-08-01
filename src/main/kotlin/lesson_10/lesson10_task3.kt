package lesson_10

fun main() {
    print("Введите длину пароля: ")
    val length = readln().toInt()
    println("Сгенерированный пароль: ${generatePassword(length)}")
}

fun generatePassword(length: Int): String {
    val digits = "0123456789"
    val specialChars = "!\"#$%&'()*+,-./ "
    var password = ""

    for (i in 0 until length) {
        val char = if (i % 2 == 0) digits[(Math.random() * digits.length).toInt()]
        else specialChars[(Math.random() * specialChars.length).toInt()]
        password += char
    }
    return password
}