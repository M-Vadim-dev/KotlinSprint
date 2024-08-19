package lesson_20

class Robot {
    private var modifier: (String) -> String = { it }

    private val phrases = listOf(
        "Привет, человек!",
        "Как дела?",
        "Сегодня хороший день!",
        "Что нового?",
        "Давай дружить!",
    )

    fun say() {
        val randomPhrase = phrases.random()
        println(modifier(randomPhrase))
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }
}

fun main() {
    val robot = Robot()
    robot.say()
    robot.setModifier { it.split(" ").reversed().joinToString(" ") }
    robot.say()
}