package lesson_13

class ContactDirectory(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
)

fun main() {
    val contacts = listOf(
        ContactDirectory("Ростислав", 89123456789, "Reddit"),
        ContactDirectory("Анна", 89123456780),
        ContactDirectory("Иван", 89123456781, "null"),
        ContactDirectory("Елена", 89123456782, "GitHub"),
        ContactDirectory("Сергей", 89123456783)
    )

    printUniqueCompanies(contacts)
}

fun printUniqueCompanies(contacts: List<ContactDirectory>) {
    val uniqueCompanies = contacts.mapNotNull { it.company }

    val printUniqueCompanies = uniqueCompanies.joinToString(", ")
    println("Все существующие компании: $printUniqueCompanies")
}