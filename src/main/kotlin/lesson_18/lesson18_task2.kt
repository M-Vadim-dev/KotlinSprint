package lesson_18

open class Dice(val sides: Int) {
    open fun roll() {}
}

class Dice4() : Dice(4) {

    override fun roll() {
        val result = (1..sides).random()
        println("Бросок кости с $sides гранями: $result")
    }
}

class Dice6() : Dice(6) {

    override fun roll() {
        val result = (1..sides).random()
        println("Бросок кости с $sides гранями: $result")
    }
}

class Dice8() : Dice(8) {

    override fun roll() {
        val result = (1..sides).random()
        println("Бросок кости с $sides гранями: $result")
    }
}

fun main() {
    val dice4 = Dice4()
    val dice6 = Dice6()
    val dice8 = Dice8()

    val dice: List<Dice> = listOf(dice4, dice6, dice8)

    for (i in dice) {
        i.roll()
    }
}