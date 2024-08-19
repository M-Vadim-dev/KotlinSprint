package lesson_20

fun main() {
    val greeting: (String) -> String = { username: String -> "С наступающим Новым Годом, $username!" }

    val username = "Иван"
    println(greeting(username))
}