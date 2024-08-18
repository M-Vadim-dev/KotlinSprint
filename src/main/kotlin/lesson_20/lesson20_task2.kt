package lesson_20

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

val healPotion: (Player) -> Unit = { player: Player ->
    player.currentHealth = player.maxHealth
    println("${player.name} восстановил здоровье. Текущее здоровье: ${player.currentHealth}")
}

fun main() {
    val player = Player(name = "Иван", currentHealth = 50, maxHealth = 100)

    println("${player.name} имеет текущее здоровье: ${player.currentHealth} из ${player.maxHealth}")
    healPotion(player)
}