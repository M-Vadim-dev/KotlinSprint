package lesson_12

const val KELVIN = 273

class WeatherInfo(
    kelvinDayTimeTemperature: Int,
    kelvinNightTimeTemperature: Int,
    val precipitation: Boolean,
) {
    var dayTimeTemperature = kelvinDayTimeTemperature - KELVIN
    var nightTimeTemperature = kelvinNightTimeTemperature - KELVIN

    fun displayWeather() {
        println("Дневная температура: $dayTimeTemperature °C")
        println("Ночная температура: $nightTimeTemperature °C")
        if (precipitation) println("Осадки ожидаются.")
        else println("Осадков нет.")
    }
}

fun main() {
    val weatherToday = WeatherInfo(298, 288, false)

    println("Погода на сегодня:")
    weatherToday.displayWeather()
}