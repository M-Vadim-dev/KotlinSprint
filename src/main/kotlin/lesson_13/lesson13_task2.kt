package lesson_13

class Contact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {

    fun printInfo() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val contact1 = Contact("Ростислав", 89123456789, "Reddit")

    contact1.printInfo()
}