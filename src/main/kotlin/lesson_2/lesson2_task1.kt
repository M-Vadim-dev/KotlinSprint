package lesson_2

fun main() {
    val numberOfStudents = 4f
    val gradesForEnglish = arrayOf(3, 4, 3, 5)
    val arithmeticMean = gradesForEnglish.sum() / numberOfStudents
    println("Средний балл по английскому: $arithmeticMean")
}