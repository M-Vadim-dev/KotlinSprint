package lesson_5

fun main() {
    val shipName = "Heart of Gold"
    val registeredUser = "Zaphod"
    val registeredPassword = "PanGalactic"

    println("Вас встречает параноидальный робот-андройд Марвин.")
    println("Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля \"$shipName\".")
    println("Что ж, введите, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа:")

    val userName = readln()

    if (userName == registeredUser) {
        println("Пожалуйста, введите ваш пароль:")
        val userPassword = readln()

        if (userPassword == registeredPassword) println("Ваши данные проверены, и о, чудо, они верны... Пользователь $userName, вам разрешено входить на борт корабля \"$shipName\".")
        else println("Неправильный пароль. Доступ запрещен.")
    } else println("Пользователь не зарегистрирован. Пожалуйста, зарегистрируйтесь и попробуйте снова.")
}