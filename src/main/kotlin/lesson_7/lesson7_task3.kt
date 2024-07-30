package lesson_7

fun main() {
    val number = readln().toInt()
    val range = 0..number

    for (i in range step 2) {
        println(i)
    }
}