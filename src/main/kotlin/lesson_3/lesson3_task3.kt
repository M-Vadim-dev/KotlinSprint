package lesson_3

fun main() {
    val firstNumber = readln().toInt()
    var secondNumber = 1
    println(
        """$firstNumber * ${secondNumber} = ${firstNumber * secondNumber}
        |$firstNumber * ${++secondNumber} = ${firstNumber * secondNumber}
        |$firstNumber * ${++secondNumber} = ${firstNumber * secondNumber}
        |$firstNumber * ${++secondNumber} = ${firstNumber * secondNumber}
        |$firstNumber * ${++secondNumber} = ${firstNumber * secondNumber}
        |$firstNumber * ${++secondNumber} = ${firstNumber * secondNumber}
        |$firstNumber * ${++secondNumber} = ${firstNumber * secondNumber}
        |$firstNumber * ${++secondNumber} = ${firstNumber * secondNumber}
        |$firstNumber * ${++secondNumber} = ${firstNumber * secondNumber}
    """.trimMargin()
    )
}