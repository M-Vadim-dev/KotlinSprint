package lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "нет информации",
) {
    fun printUserInfo() {
        println("User: id = $id, login = $login, e-mail = $email, bio = ${bio})")
    }

    fun setBio() {
        println("Введите информацию о себе:")
        bio = readln()
    }

    fun changePassword() {
        println("Введите текущий пароль:")
        if (readln() == password) {
            println("Введите новый пароль:")
            password = readln()
            println("Пароль изменён.")
        } else println("Неверный текущий пароль.")
    }
}

fun main() {
    val user = User2(1, "user1", "pass123", "user1@mail.ru")

    user.setBio()
    user.changePassword()
    user.printUserInfo()
}