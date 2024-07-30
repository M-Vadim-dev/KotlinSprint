package lesson_7

fun main() {
    val letters = 'a'..'z'
    val digits = '0'..'9'
    val lengthPassword = 0 until 6
    var password = ""

    for (i in lengthPassword) {
        password +=
            if (i % 2 == 0) {
                letters.random()
            } else {
                digits.random()
            }
    }
    println("Сгенерированный пароль: $password")
}
