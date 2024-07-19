package lesson_3

fun main() {
    val firstNumber = readln().toInt()
    var counter = 0
    while (counter < 9) println("$firstNumber * ${++counter} = ${firstNumber * counter}")
}
