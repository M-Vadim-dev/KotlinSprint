package lesson_21

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(list.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int = filter { it % 2 == 0 }.sum()