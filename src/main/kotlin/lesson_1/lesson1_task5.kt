package lesson_1

const val MINUTES = 60

fun main() {
    val totalSeconds = 6489
    val seconds = totalSeconds % MINUTES
    val minute = (totalSeconds / MINUTES) % MINUTES
    val hour = (totalSeconds / (MINUTES * MINUTES))
    val hoursAndMinutesAndSeconds = "%02d:%02d:%02d".format(hour, minute, seconds)
    println("Время, проведенное в космосе: $hoursAndMinutesAndSeconds")
}