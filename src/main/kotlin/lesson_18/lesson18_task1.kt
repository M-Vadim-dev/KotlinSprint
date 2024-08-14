package lesson_18

class Order {

    fun printDetails(
        idOrder: Int,
        items: String,
    ) {
        println("Заказан товар: $items")
    }

    fun printDetails(
        idOrder: Int,
        items: List<String>,
    ) {
        println("Заказаны следующие товары: ${items.joinToString(", ")}")
    }

}

fun main() {

    val singleOrder = Order()
    singleOrder.printDetails(1, "Ноутбук")

    val order = Order()
    order.printDetails(2, listOf("Мышь", "Клавиатура", "Чехол"))

}


