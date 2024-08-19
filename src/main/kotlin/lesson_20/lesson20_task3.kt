package lesson_20

class Player1(
    val name: String,
    var hasKey: Boolean = false,
)

val checkDoor: (Player1) -> Unit = { player: Player1 ->
    if (player.hasKey) println("${player.name} открыл дверь.")
    else println("Дверь заперта.")
}

fun main() {
    val playerWithKey = Player1("Игрок1", true)
    val playerWithoutKey = Player1("Игрок2")

    checkDoor(playerWithKey)
    checkDoor(playerWithoutKey)
}