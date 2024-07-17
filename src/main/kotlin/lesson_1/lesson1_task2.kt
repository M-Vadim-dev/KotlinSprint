package lesson_1

fun main() {
    val numberOfOrders: Int = 75
    val thanksForPurchase: String = "Благодарим за покупку!"
    println("Количество заказов: $numberOfOrders")
    println(thanksForPurchase)
    var numberOfEmployees: Int = 2000
    println("Количество работников интернет-магазина: $numberOfEmployees")
    val numberOfDismissed: Int = 1
    numberOfEmployees -= numberOfDismissed // увольнение работников
    println("Количество работников интернет-магазина после увольнения: $numberOfEmployees")
}