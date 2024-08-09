package lesson_13

class ContactDirectoryBook(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
)

fun main() {
    var phoneNumber: Long?

    while (true) {
        print("Введите номер: ")
        val phoneNumberInput = readln()
        try {
            if (phoneNumberInput.all { it.isDigit() }) {
                phoneNumber = phoneNumberInput.toLong()
                println("Номер успешно введён: $phoneNumber")
                break
            } else throw IllegalArgumentException("Некорректный ввод '$phoneNumberInput'. Введите только цифры.")
        } catch (e: NumberFormatException) {
            println("Ошибка: не удалось преобразовать строку в номер.")
        } catch (e: IllegalArgumentException) {
            println("Ошибка: ${e.message}")
        }
    }
}