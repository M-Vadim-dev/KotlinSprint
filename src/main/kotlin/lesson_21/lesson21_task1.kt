package lesson_21

fun main() {
    val string = "Hello"
    println(string.vowelCount())
}

fun String.vowelCount(): Int = count { it in "aeiouAEIOU" }