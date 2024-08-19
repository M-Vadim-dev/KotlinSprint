package lesson_22

data class Person(val name: String, val age: Int, val city: String)

fun main() {
    val person = Person("Вадим", 30, "Москва")

    val (name, age, city) = person

    println("Имя: $name\nВозраст: $age\nГород: $city")
}