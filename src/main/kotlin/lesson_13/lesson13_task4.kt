package lesson_13

class PhoneBookContact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    companion object {
        fun printInfo(contacts: List<PhoneBookContact>) {
            contacts.forEach { contact ->
                println("Имя: ${contact.name}, Номер: ${contact.phoneNumber}, Компания: ${contact.company ?: "Не указана"}")
            }
        }
    }
}

fun main() {
    val phoneBook = mutableListOf<PhoneBookContact>()
    var response = "да"

    while (response == "да") {
        print("Введите имя: ")
        val name = readln()
        print("Введите номер: ")
        val phoneNumber = readln().toLongOrNull()

        if (phoneNumber == null) {
            println("Ошибка: номер телефона не введен или введен некорректно.")
            continue
        }
        print("Введите компанию: ")
        val company: String? = readln().takeIf { it.isNotBlank() }

        phoneBook.add(PhoneBookContact(name, phoneNumber, company))

        print("Хотите добавить еще контакт? (да/нет): ")
        response = readln().lowercase()
    }

    PhoneBookContact.printInfo(phoneBook)
}