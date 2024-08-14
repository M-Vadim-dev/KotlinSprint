package lesson_17

class User(private var _login: String, private var _password: String) {

    var password: String
        get() = "*".repeat(_password.length)
        set(value) {
            println("Вы не можете изменить пароль.")
        }

    var login: String
        get() = _login
        set(value) {
            _login = value
            println("Логин успешно изменён.")
        }

    fun getInfo(): String = "Логин: $login\nПароль: $password"

}

fun main() {
    val user = User("User123", "Password123")

    println(user.getInfo())

    user.login = "User345"
    println(user.getInfo())

    user.password = "555Password"
    println(user.getInfo())
}