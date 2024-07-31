package lesson_9

fun main() {
    val eggsPerPortion = 2
    val milkPerPortion = 50
    val butterPerPortion = 15

    val ingredientsPerPortion = listOf(eggsPerPortion, milkPerPortion, butterPerPortion)

    println("Введите количество порций омлета:")
    val portions = readln().toInt()

    val totalEggs = ingredientsPerPortion[0] * portions
    val totalMilk = ingredientsPerPortion[1] * portions
    val totalButter = ingredientsPerPortion[2] * portions

    println("На $portions порций вам понадобится:")
    println("Яиц – $totalEggs шт.")
    println("Молока – $totalMilk мл.")
    println("Сливочного масла – $totalButter гр.")
}