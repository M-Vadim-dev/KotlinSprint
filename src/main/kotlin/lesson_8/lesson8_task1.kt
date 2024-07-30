package lesson_8

fun main() {
    val viewsMonday = 120
    val viewsTuesday = 150
    val viewsWednesday = 170
    val viewsThursday = 130
    val viewsFriday = 200
    val viewsSaturday = 180
    val viewsSunday = 160

    val viewsWeek: Array<Int> =
        arrayOf(viewsMonday, viewsTuesday, viewsWednesday, viewsThursday, viewsFriday, viewsSaturday, viewsSunday)

    val totalViews = viewsWeek.sum()

    println("Общее количество просмотров за неделю: $totalViews")
}