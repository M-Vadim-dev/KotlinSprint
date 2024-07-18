package lesson_2

fun main() {
    val totalAmount = 70_000
    println("Сумма вклада: $totalAmount")

    val interestRate = 16.7
    println("Процентная ставка: $interestRate%")

    val timePeriod = 20
    println("Срок вклада: $timePeriod лет")

    val amountDeposit = totalAmount * Math.pow(1 + interestRate / 100, timePeriod.toDouble())
    println("Результат: ${"%.3f".format(amountDeposit)}")
}