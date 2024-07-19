package lesson_2

fun main() {
    val numberOfStudents = 4
    val gradesForEnglish = arrayOf(3, 4, 3, 5)
    val arithmeticMean = gradesForEnglish.sum().toFloat() / numberOfStudents
    println("Средний балл по английскому: $arithmeticMean")
}