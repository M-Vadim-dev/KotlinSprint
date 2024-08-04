package lesson_12

class WeatherData {
    var daytimeTemperature: Float = 20.0f
    var nighttimeTemperature: Float = 10.0f
    var precipitation: Float = 0.0f

    fun displayWeather() {
        println("Дневная температура: $daytimeTemperature °C")
        println("Ночная температура: $nighttimeTemperature °C")
        println("Осадки: $precipitation мм")
    }
}

fun main() {
    val weatherDay1 = WeatherData()
    val weatherDay2 = WeatherData()

    weatherDay1.daytimeTemperature = 25.0f
    weatherDay1.nighttimeTemperature = 15.0f
    weatherDay1.precipitation = 5.0f

    weatherDay2.daytimeTemperature = 30.0f
    weatherDay2.nighttimeTemperature = 20.0f
    weatherDay2.precipitation = 0.0f

    println("Погода на день 1:")
    weatherDay1.displayWeather()

    println("\nПогода на день 2:")
    weatherDay2.displayWeather()
}