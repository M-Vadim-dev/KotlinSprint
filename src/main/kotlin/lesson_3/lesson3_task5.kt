package lesson_3

fun main() {
    val inputString = "D2-D4;0"
    val parts = inputString.split("-", ";")
    val from = parts[0]
    val to = parts[1]
    val moveNumber = parts[2].toInt()

    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода: $moveNumber")
}