package lesson_17

class Ship(private var _shipName: String, var averageSpeed: Int, var homePort: String) {

    var name: String
        get() = _shipName
        set(value) {
            println("Нельзя изменить имя корабля \"$name\".")
        }

    var speed: Int
        get() = averageSpeed
        set(value) {
            averageSpeed = value
        }

    var port: String
        get() = homePort
        set(value) {
            homePort = value
        }

    fun printInfo() {
        println("Имя корабля: $name")
        println("Средняя скорость: $speed узлов")
        println("Порт приписки: $port")
    }
}

fun main() {
    val ship = Ship("Чёрная жемчужина", 25, "Тортуга")

    ship.printInfo()

    ship.name = "Queen Anne's Revenge"

    ship.speed = 30
    ship.port = "Порт Роял"

    ship.printInfo()
}