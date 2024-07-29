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
            println("Для продолжения авторизации нужно решить пример:")

            for (attempt in 3 downTo 1) {
                val number1 = (1..9).random()
                val number2 = (1..9).random()
                print("$number1 + $number2 = ")

                if (readln().toInt() == number1 + number2) {
                    println("Добро пожаловать!")
                    return
                }
                println("Неверно. У вас осталось ${attempt - 1} попыток.")
            }
            println("Доступ запрещен.")
            break
        } else println("Логин или пароль неверны, попробуйте снова.")
    }
}