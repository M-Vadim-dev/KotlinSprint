package lesson_1

fun main() {
    val totalSeconds = 6489
    val seconds = totalSeconds % 60
    val minute = (totalSeconds / 60) % 60
    val hour = (totalSeconds / 3600)
    val hoursAndMinutesAndSeconds = "%02d:%02d:%02d".format(hour,minute,seconds)
    println("Время, проведенное в космосе: $hoursAndMinutesAndSeconds")
}