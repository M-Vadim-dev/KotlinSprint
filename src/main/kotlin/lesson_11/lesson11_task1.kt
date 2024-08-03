package lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {
}

fun main() {
    val user1 = User(1, "user1", "pass123", "user1@mail.ru")
    val user2 = User(2, "user2", "pass234", "user2@mail.ru")

    println("User1: id = ${user1.id}, login = ${user1.login}, password = ${user1.password}, e-mail = ${user1.email}")
    println("User2: id = ${user2.id}, login = ${user2.login}, password = ${user2.password}, e-mail = ${user2.email}")
}