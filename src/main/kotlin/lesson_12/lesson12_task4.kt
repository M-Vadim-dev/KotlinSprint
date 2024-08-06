package lesson_12

class WeatherInfoData(
    kelvinDayTimeTemperature: Int,
    kelvinNightTimeTemperature: Int,
    val precipitation: Boolean,
) {
    private val kelvin = 273
    var dayTimeTemperature = kelvinDayTimeTemperature - kelvin
    var nightTimeTemperature = kelvinNightTimeTemperature - kelvin

    init {
        displayWeather()
    }

    fun displayWeather() {
        println("Дневная температура: $dayTimeTemperature °C")
        println("Ночная температура: $nightTimeTemperature °C")
        if (precipitation) println("Осадки ожидаются.")
        else println("Осадков нет.")
    }
}

fun main() {
    val weatherInfo = WeatherInfoData(298, 288, false)
}