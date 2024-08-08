package lesson_14

open class Liner(
    var passengersCapacity: Int = 100,
    var speed: Int = 30,
    var volume: Int = 1000
)

class CargoShip(
    passengersCapacity: Int = 50,
    speed: Int = 20,
    volume: Int = 2000
) : Liner(passengersCapacity, speed, volume)

class Icebreaker(
    passengersCapacity: Int = 20,
    speed: Int = 15,
    volume: Int = 500
) : Liner(passengersCapacity, speed, volume)

fun main() {
    val liner = Liner()
    val cargoShip = CargoShip()
    val icebreaker = Icebreaker()

    println("Лайнер: Вместимость пассажиров = ${liner.passengersCapacity}, Скорость = ${liner.speed}, Объем = ${liner.volume}")
    println("Грузовой корабль: Вместимость пассажиров = ${cargoShip.passengersCapacity}, Скорость = ${cargoShip.speed}, Объем = ${cargoShip.volume}")
    println("Ледокол: Вместимость пассажиров = ${icebreaker.passengersCapacity}, Скорость = ${icebreaker.speed}, Объем = ${icebreaker.volume}")
}