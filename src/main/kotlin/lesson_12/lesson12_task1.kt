package lesson_12

class WeatherData {
    var daytimeTemperature: Float = 20.0f
    var nighttimeTemperature: Float = 10.0f
    var precipitation: Boolean = false

    fun displayWeather() {
        println("Погода на день:")
        println("Дневная температура: $daytimeTemperature °C")
        println("Ночная температура: $nighttimeTemperature °C")
        if (precipitation) println("Осадки ожидаются.")
        else println("Осадков нет.")
    }
}

fun main() {
    val weatherDay1 = WeatherData()
    val weatherDay2 = WeatherData()

    weatherDay1.daytimeTemperature = 25.0f
    weatherDay1.nighttimeTemperature = 15.0f
    weatherDay1.precipitation = true

    weatherDay2.daytimeTemperature = 30.0f
    weatherDay2.nighttimeTemperature = 20.0f

    weatherDay1.displayWeather()
    weatherDay2.displayWeather()
}