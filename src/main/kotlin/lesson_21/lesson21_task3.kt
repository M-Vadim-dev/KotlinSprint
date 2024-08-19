package lesson_21

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

fun Player.isHealthy(): Boolean = this.currentHealth == this.maxHealth

fun main() {
    val player = Player(name = "Игрок", currentHealth = 100, maxHealth = 100)

    println("${player.name} здоров: ${player.isHealthy()}")

    player.currentHealth = 50
    println("${player.name} здоров: ${player.isHealthy()}")
}