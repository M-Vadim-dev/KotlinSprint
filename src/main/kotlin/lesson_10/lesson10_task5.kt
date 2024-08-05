package lesson_10

const val LOGIN = "user123"
const val PASSWORD = "pass123"

fun main() {
    val usernameInput = "user123"
    val passwordInput = "pass123"

    val token = authorize(usernameInput, passwordInput) ?: run {
        println("Неудачная авторизация.")
        return
    }
    val shoppingCart = getCart(token)

    println("Содержимое корзины: $shoppingCart")
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

fun getCart(token: String): List<String> {
    val cart = listOf("товар1", "товар2", "товар3")
    return cart
}