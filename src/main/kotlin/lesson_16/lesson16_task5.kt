package lesson_16

class Player(private val name: String, initialHealth: Int, private var attackPower: Int) {
    private var health: Int = if (initialHealth < 0) 0 else initialHealth

    fun takeDamage(damage: Int) {
        if (health > 0) {
            health -= damage
            if (health < 0) health = 0

            println("$name получил $damage урона. Текущее здоровье: $health.")

            if (health == 0) handleDeath()

        } else println("$name мёртв и не может получить урон.")
    }

    fun heal(amount: Int) {
        if (health > 0) {
            health += amount
            println("$name излечился на $amount. Текущее здоровье: $health.")
        } else println("$name не может исцелиться, так как мёртв.")
    }

    private fun handleDeath() {
        health = 0
        attackPower = 0
        println("$name мёртв. Здоровье и сила удара обнулены.")
    }

    fun getHealth(): Int = health

    fun getName(): String = name

    fun getAttackPower(): Int = attackPower
}

fun main() {
    val player = Player("Воин", 100, 20)

    player.takeDamage(30)
    player.heal(20)
    player.takeDamage(50)
    player.takeDamage(30)
    player.heal(10)
    player.takeDamage(20)
    player.heal(15)
}