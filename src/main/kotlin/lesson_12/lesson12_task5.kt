package lesson_12

class DataWeatherInfo(
    kelvinDayTimeTemperature: Int,
    kelvinNightTimeTemperature: Int,
    val precipitation: Boolean,
) {
    private val kelvin = 273
    var dayTimeTemperature = kelvinDayTimeTemperature - kelvin
    var nightTimeTemperature = kelvinNightTimeTemperature - kelvin

    companion object {
        fun averageDayTimeTemperature(weatherList: List<DataWeatherInfo>): Int {
            return weatherList.map { it.dayTimeTemperature }.average().toInt()
        }

        fun averageNightTimeTemperature(weatherList: List<DataWeatherInfo>): Int {
            return weatherList.map { it.nightTimeTemperature }.average().toInt()
        }
    }
}

fun main() {
    val weatherList = mutableListOf<DataWeatherInfo>()

    val dayTemperatures = mutableListOf<Int>()
    val nightTemperatures = mutableListOf<Int>()
    val precipitationDays = mutableListOf<Boolean>()

    for (i in 1..30) {
        val kelvinDayTime = (280..320).random()
        val kelvinNightTime = (270..300).random()
        val precipitation = listOf(true, false).random()

        val weatherInfo = DataWeatherInfo(kelvinDayTime, kelvinNightTime, precipitation)
        weatherList.add(weatherInfo)

        dayTemperatures.add(kelvinDayTime)
        nightTemperatures.add(kelvinNightTime)
        precipitationDays.add(precipitation)
    }

    val averageDayTemperature = DataWeatherInfo.averageDayTimeTemperature(weatherList)
    val averageNightTemperature = DataWeatherInfo.averageNightTimeTemperature(weatherList)
    val totalPrecipitationDays = precipitationDays.count { it }

    println("Средняя температура днём: $averageDayTemperature")
    println("Средняя температура ночью: $averageNightTemperature")
    println("Количество дней с осадками: $totalPrecipitationDays")
}