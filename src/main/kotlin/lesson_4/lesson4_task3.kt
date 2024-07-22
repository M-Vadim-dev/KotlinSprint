package lesson_4

const val REQUIRED_HUMIDITY = 20
const val SEASON = "весна"
const val IS_SUNNY_WEATHER = true
const val IS_TENT_OPEN = true

fun main() {
    val isSunnyWeather: Boolean = true
    val isTentOpen: Boolean = true
    val humidity: Int = 20
    val currentSeason: String = "зима"

    val favorableConditions: Boolean =
        (isSunnyWeather == IS_SUNNY_WEATHER) && (isTentOpen == IS_TENT_OPEN) && (humidity == REQUIRED_HUMIDITY) && (currentSeason == SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}