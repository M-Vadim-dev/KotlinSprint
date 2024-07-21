package lesson_4

fun main() {
    val trainingDay = 5

    val armsAndAbsExercises = (trainingDay % 2) == 1   // Нечетные дни: руки и пресс
    val legsAndBackExercises = (trainingDay % 2) == 0   // Четные дни: ноги и спина

    println(
        """Упражнения для рук:    $armsAndAbsExercises
Упражнения для ног:    $legsAndBackExercises
Упражнения для спины:  $legsAndBackExercises
Упражнения для пресса: $armsAndAbsExercises"""
    )
}