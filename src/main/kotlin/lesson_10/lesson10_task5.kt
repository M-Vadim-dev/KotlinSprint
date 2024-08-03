package lesson_10

const val LOGIN = "user123"
const val PASSWORD = "pass123"

val CART = listOf("товар1", "товар2", "товар3")

fun main() {
    val usernameInput = "user123"
    val passwordInput = "pass123"

    val token = authorize(usernameInput, passwordInput)
    val cart = getCart(token)

    if (cart != null) println("Содержимое корзины: $cart")
    else println("Неудачная авторизация.")
}

fun generateToken(): String {
    val letters = 'a'..'z'
    val capitalizeLetters = 'A'..'Z'
    val digits = '0'..'9'
    val chars = letters + capitalizeLetters + digits

    return (1..32).map { chars.random() }.joinToString("")
}

fun authorize(username: String, password: String): String? =
    if (username == LOGIN && password == PASSWORD) generateToken()
    else null

fun getCart(token: String?): List<String>? = if (token != null) CART else null