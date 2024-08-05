package lesson_12

class WeatherDataInfo(
    var daytimeTemperature: Float,
    var nighttimeTemperature: Float,
    var precipitation: Boolean,
) {
    fun displayWeather() {
        println("Дневная температура: $daytimeTemperature °C")
        println("Ночная температура: $nighttimeTemperature °C")
        if (precipitation) println("Осадки ожидаются.")
        else println("Осадков нет.")
    }
}

fun main() {
    val weatherToday = WeatherDataInfo(25.0f, 15.0f, false)

    println("Погода на сегодня:")
    weatherToday.displayWeather()
}