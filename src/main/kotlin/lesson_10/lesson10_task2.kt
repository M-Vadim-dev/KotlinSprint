package lesson_10

fun main() {
    println("Введите логин:")
    val login = readln()
    println("Введите пароль:")
    val password = readln()

    if (validateInput(login) && validateInput(password)) println("Добро пожаловать, $login!")
    else println("Логин или пароль недостаточно длинные.")
}

const val LENGTH_LOGIN_PASSWORD = 4

fun validateInput(input: String): Boolean {
    return input.length >= LENGTH_LOGIN_PASSWORD
}