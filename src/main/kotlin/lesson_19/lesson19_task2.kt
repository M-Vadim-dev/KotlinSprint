package lesson_19

enum class Category {
    CLOTHING,
    STATIONERY,
    MISC;

    fun getCategoryName(): String = when (this) {
        CLOTHING -> "Одежда"
        STATIONERY -> "Канцелярские товары"
        MISC -> "Разное"
    }
}

class Product(val name: String, private val id: Int, private val category: Category) {
    fun displayInfo() {
        println("Товар: $name (ID: $id), Категория: ${category.getCategoryName()}")
    }
}

fun main() {
    val product1 = Product("Футболка", 1, Category.CLOTHING)
    val product2 = Product("Блокнот", 2, Category.STATIONERY)
    val product3 = Product("Кружка", 3, Category.MISC)

    product1.displayInfo()
    product2.displayInfo()
    product3.displayInfo()
}