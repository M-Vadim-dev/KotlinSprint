package lesson_16

class User(private val username: String, private val password: String) {

    fun validatePassword(inputPassword: String): Boolean = password == inputPassword
}

fun main() {
    val user = User("Username", "Password")
    val inputPassword = "Password"

    if (user.validatePassword(inputPassword)) println("Пароль верный.")
    else println("Пароль неверный.")
}