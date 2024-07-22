package lesson_4

fun main() {
    val trainingDay = 5

    val legsAndBackExercises = (trainingDay % 2) != 0

    println(
        """Упражнения для рук: $legsAndBackExercises
Упражнения для ног: ${!legsAndBackExercises}
Упражнения для спины: ${!legsAndBackExercises}
Упражнения для пресса: $legsAndBackExercises
""".trimIndent()
    )
}