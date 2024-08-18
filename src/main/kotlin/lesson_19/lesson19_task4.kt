package lesson_19

enum class Ammo(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank {

    fun arm(ammo: Ammo) {
        currentAmmo = ammo
        println("Танк вооружен патронами: ${ammo.name} (Урон: ${ammo.damage})")
    }

    fun shoot() {
        if (currentAmmo != null) println("Выстрел! Нанесённый урон: ${currentAmmo!!.damage}")
        else println("Танк ничем не заряжен!")

    }

    private var currentAmmo: Ammo? = null
}

fun main() {
    val tank = Tank()

    tank.shoot()
    tank.arm(Ammo.BLUE)
    tank.shoot()
    tank.arm(Ammo.GREEN)
    tank.shoot()
    tank.arm(Ammo.RED)
    tank.shoot()
}