package lesson_14

open class Liner1(
    var passengersCapacity: Int = 100,
    var speed: Int = 30,
    var volume: Int = 1000
) {
    private var isRampExtended: Boolean = false

    fun extendRamp() {
        if (!isRampExtended) {
            isRampExtended = true
            println("Горизонтальный трап выдвинут.")
        } else println("Горизонтальный трап убран.")
    }

    open fun displayInfo() {
        println("Корабль: Liner")
        println("Пассажировместимость: $passengersCapacity")
        println("Скорость: $speed")
        println("Объем: $volume")
    }
}

class CargoShip1(
    passengersCapacity: Int = 50,
    speed: Int = 20,
    volume: Int = 2000
) : Liner1(passengersCapacity, speed, volume) {

    private var isCraneActive: Boolean = false

    fun activateCrane() {
        if (!isCraneActive) {
            isCraneActive = true
            println("Погрузочный кран активирован.")
        } else println("Погрузочный кран деактивирован.")
    }

    fun loadCargo(amount: Int) {
        println("Загрузка груза в размере $amount тонн.")
    }

    override fun displayInfo() {
        println("Корабль: CargoShip")
        println("Пассажировместимость: $passengersCapacity")
        println("Скорость: $speed")
        println("Объем: $volume")
    }
}

class Icebreaker1(
    passengersCapacity: Int = 20,
    speed: Int = 15,
    volume: Int = 500
) : Liner1(passengersCapacity, speed, volume) {

    private var areGatesOpen: Boolean = false

    fun openGates() {
        if (!areGatesOpen) {
            areGatesOpen = true
            println("Ворота со стороны кормы открыты.")
        } else println("Ворота со стороны кормы закрыты.")
    }

    fun breakIce() {
        println("Ледокол начинает ломать лёд.")
    }

    override fun displayInfo() {
        println("Корабль: Icebreaker")
        println("Пассажировместимость: $passengersCapacity")
        println("Скорость: $speed")
        println("Объем: $volume")
    }
}

fun main() {
    val liner = Liner1()
    liner.extendRamp()
    liner.displayInfo()

    val cargoShip = CargoShip1()
    cargoShip.activateCrane()
    cargoShip.loadCargo(100)
    cargoShip.displayInfo()

    val icebreaker = Icebreaker1()
    icebreaker.openGates()
    icebreaker.breakIce()
    icebreaker.displayInfo()
}
