package lesson_6

fun main() {
    val users = mutableMapOf<String, String>()

    print("Создайте логин: ")
    val userName = readln()
    print("Создайте пароль: ")
    val password = readln()

    users[userName] = password
    println("Регистрация прошла успешно! Теперь вы можете войти.")

    while (true) {
        print("Введите ваш логин: ")
        val loginInput = readln()
        print("Введите ваш пароль: ")
        val passwordInput = readln()

        if (users[loginInput] == passwordInput) {
            println("Авторизация прошла успешно.")
            break
        } else println("Логин или пароль неверны, попробуйте снова.")
    }
}
