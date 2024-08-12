package lesson_17

class Ship(private val shipName: String, var averageSpeed: Int, var homePort: String) {

    val name: String
        get() = shipName

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

    fun updateName(newName: String) {
        println("Нельзя изменить имя корабля \"$shipName\".")
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

    ship.updateName("Queen Anne's Revenge")

    ship.speed = 30
    ship.port = "Порт Роял"

    ship.printInfo()
}