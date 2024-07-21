package lesson_3

fun main() {
    var from = "E2"
    var to = "E4"
    var moveNumber = 1

    val moveString = "$from-$to;$moveNumber"
    println(moveString)

    from = "D2"
    to = "D3"
    moveNumber += 1

    val nextMoveString = "$from-$to;$moveNumber"
    println(nextMoveString)

    val nextToMove = "D3"
    println(nextToMove)
}