package lesson_15

abstract class Product(val name: String, var quantity: Int)

interface Searchable {
    fun searchAccessories(instrumentName: String): List<String>
}

class Instrument(name: String, quantity: Int) : Product(name, quantity), Searchable {

    override fun searchAccessories(instrumentName: String): List<String> {
        println("Выполняется поиск комплектующих инструмента: $instrumentName")
        return listOf("Комплектующее 1 для $instrumentName", "Комплектующее 2 для $instrumentName")
    }
}

class Accessory(name: String, quantity: Int) : Product(name, quantity)

fun main() {
    val guitar = Instrument("Гитара", 5)
    val foundAccessories = guitar.searchAccessories(guitar.name)

    println("Найденные комплектующие: $foundAccessories")
}