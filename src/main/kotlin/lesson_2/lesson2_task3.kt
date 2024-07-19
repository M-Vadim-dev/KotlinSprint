package lesson_2

const val MINUTES = 60
const val HOURS = 24

fun main() {
    val departureTimeHour = 9
    val departureTimeMinute = 39
    val durationTravelTimeMinutes = 457
    val sumArrivalTimeHour = durationTravelTimeMinutes / MINUTES
    val arrivalTimeMinute = durationTravelTimeMinutes - (sumArrivalTimeHour * MINUTES)
    var arrivalTimeHour = (departureTimeHour + sumArrivalTimeHour) % HOURS
    val sumArrivalTimeMinute = (departureTimeMinute + arrivalTimeMinute) % MINUTES
    println(sumArrivalTimeMinute)
    if ((sumArrivalTimeHour * MINUTES) >= MINUTES) arrivalTimeHour++
    println("Время отправления поезда: $departureTimeHour:$departureTimeMinute")
    println("Время прибытия поезда: $arrivalTimeHour:$sumArrivalTimeMinute")
}