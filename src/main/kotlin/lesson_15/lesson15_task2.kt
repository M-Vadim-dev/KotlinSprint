package lesson_15

abstract class WeatherStationStats {
    abstract fun getData(): String
}

class Temperature(private val temperature: Int) : WeatherStationStats() {
    override fun getData() = "Температура: $temperature°C"
}

class PrecipitationAmount(private val amount: Int) : WeatherStationStats() {
    override fun getData() = "Количество осадков: $amount мм"
}

class WeatherServer {

    fun sendMessage(weatherData: WeatherStationStats) {
        val message = when (weatherData) {
            is Temperature -> weatherData.getData()
            is PrecipitationAmount -> weatherData.getData()
            else -> "Неизвестный тип данных"
        }
        println(message)
    }

}

fun main() {
    val temperature = Temperature(22)
    val precipitation = PrecipitationAmount(5)
    val server = WeatherServer()

    server.sendMessage(temperature)
    server.sendMessage(precipitation)
}