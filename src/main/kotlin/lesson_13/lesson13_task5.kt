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

        if (phoneNumberInput.all { it.isDigit() }) {
            phoneNumber = phoneNumberInput.toLongOrNull()
            if (phoneNumber != null) {
                println("Номер успешно введён: $phoneNumber")
                break
            } else println("Ошибка: не удалось преобразовать строку в номер.")

        } else println("Ошибка: некорректный ввод '$phoneNumberInput'. Введите только цифры.")

    }
}