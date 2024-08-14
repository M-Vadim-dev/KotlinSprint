package lesson_18

open class Die(val sides: Int) {
    open fun roll() {}
}

class Die4() : Die(4) {

    override fun roll() {
        val result = (1..sides).random()
        println("Бросок кости с $sides гранями: $result")
    }
}

class Die6() : Die(6) {

    override fun roll() {
        val result = (1..sides).random()
        println("Бросок кости с $sides гранями: $result")
    }
}

class Die8() : Die(8) {

    override fun roll() {
        val result = (1..sides).random()
        println("Бросок кости с $sides гранями: $result")
    }
}

fun main() {
    val die4 = Die4()
    val die6 = Die6()
    val die8 = Die8()

    val dice: List<Die> = listOf(die4, die6, die8)

    for (die in dice) {
        die.roll()
    }
}