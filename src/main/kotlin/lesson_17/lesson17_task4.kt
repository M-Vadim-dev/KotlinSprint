package lesson_17

class Parcel(
    private val trackingNumber: Int,
    private var _location: String = "На складе",
) {
    var location: String
        get() = _location
        set(value) {
            _location = value
            movementCounter++
        }

    fun getInfo(): String = "Номер посылки: $trackingNumber\nМестоположение: $location\nПеремещений: $movementCounter\n"

    private var movementCounter: Int = 0
}

fun main() {
    val parcel = Parcel(14)

    println(parcel.getInfo())

    parcel.location = "В пути"
    println(parcel.getInfo())

    parcel.location = "В пункте назначения"
    println(parcel.getInfo())
}

