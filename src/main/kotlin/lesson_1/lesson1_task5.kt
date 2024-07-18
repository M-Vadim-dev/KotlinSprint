package lesson_1

const val TOTAL_SECONDS = 6489
const val MINUTES = 60

fun main() {
    val seconds = TOTAL_SECONDS % MINUTES
    val minute = (TOTAL_SECONDS / MINUTES) % MINUTES
    val hour = (TOTAL_SECONDS / (MINUTES * MINUTES))
    val hoursAndMinutesAndSeconds = "%02d:%02d:%02d".format(hour, minute, seconds)
    println("Время, проведенное в космосе: $hoursAndMinutesAndSeconds")
}