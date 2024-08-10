package lesson_15

abstract class Vehicle

interface Movable {
    fun move()
}

interface PassengerTransport {
    fun loadPassengers(count: Int): String
    fun unloadPassengers(count: Int): String
}

interface CargoTransport {
    fun loadCargo(weight: Int): String
    fun unloadCargo(weight: Int): String
}

class PassengerCar(private var passengers: Int) : Vehicle(), PassengerTransport, Movable {
    private val maxPassengers = 3

    override fun loadPassengers(count: Int): String {
        return if (passengers + count <= maxPassengers) {
            passengers += count
            "$count пассажиров загружено."
        } else "Невозможно загрузить $count пассажиров. Максимум $maxPassengers."
    }

    override fun unloadPassengers(count: Int): String {
        passengers -= count
        return "$count пассажиров выгружено."
    }

    override fun move() {
        println("Легковой автомобиль движется.")
    }
}

class CargoCar(private var passengers: Int, private var weightCargo: Int) : Vehicle(), CargoTransport,
    PassengerTransport, Movable {
    private val maxCargoWeight = 2000
    private val maxPassengers = 1

    override fun loadCargo(weight: Int): String {
        return if (weightCargo + weight <= maxCargoWeight) {
            weightCargo += weight
            "$weight кг груза загружено."
        } else "Невозможно загрузить $weight кг. Максимально допустимый вес $maxCargoWeight кг."
    }

    override fun unloadCargo(weight: Int): String {
        weightCargo -= weight
        return "$weight кг груза выгружено."
    }

    override fun loadPassengers(count: Int): String {
        return if (passengers + count <= maxPassengers) {
            passengers += count
            "$count пассажиров загружено."
        } else "Невозможно загрузить $count пассажиров. Максимум $maxPassengers."
    }

    override fun unloadPassengers(count: Int): String {
        passengers -= count
        return "$count пассажиров выгружено."
    }

    override fun move() {
        println("Грузовой автомобиль движется.")
    }
}

fun main() {
    val passengerCar1 = PassengerCar(0)
    val passengerCar2 = PassengerCar(0)

    println(passengerCar1.loadPassengers(3))
    println(passengerCar2.loadPassengers(2))

    val cargoCar = CargoCar(0, 0)

    println(cargoCar.loadPassengers(1))

    println(cargoCar.loadCargo(2000))

    passengerCar1.move()
    passengerCar2.move()
    cargoCar.move()

    println(passengerCar1.unloadPassengers(3))
    println(passengerCar2.unloadPassengers(3))

    println(cargoCar.unloadPassengers(1))
    println(cargoCar.unloadCargo(2000))
}