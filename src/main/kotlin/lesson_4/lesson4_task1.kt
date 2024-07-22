package lesson_4

fun main() {
    val totalTables = 13
    val bookedToday = 13
    val freeTables = 4

    val bookedTomorrow = totalTables - freeTables
    val availabilityToday = bookedToday < totalTables
    val availabilityTomorrow = bookedTomorrow < totalTables

    println("Доступность столиков на сегодня: $availabilityToday")
    println("Доступность столиков на завтра: $availabilityTomorrow")
}