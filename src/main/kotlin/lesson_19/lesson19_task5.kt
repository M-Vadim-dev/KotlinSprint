package lesson_19

enum class Gender(val description: String) {
    MALE("мужской"),
    FEMALE("женский"),
}

data class Person(val name: String, var gender: Gender)

fun main() {
    val people = mutableListOf<Person>()

    println("Введите 5 человек в формате: Имя Пол (мужской, женский)")

    while (people.size < 5) {
        val input = readln()
        val parts = input.split(" ")

        val name = parts[0]
        val gender = when (parts.getOrNull(1)?.lowercase()) {
            "мужской" -> Gender.MALE
            "женский" -> Gender.FEMALE
            else -> {
                println("Ошибка: неверное значение пола. Попробуйте снова.")
                continue
            }
        }
        people.add(Person(name, gender))
    }

    println("\nСписок людей:")
    people.forEach { println("Имя: ${it.name}, Пол: ${it.gender.description}") }
}