package lesson_16

class Dice {
    private val value: Int = (1..6).random()

    fun roll() {
        println("Значение кубика: $value")
    }
}

fun main() {
    val dice = Dice()
    dice.roll()
}