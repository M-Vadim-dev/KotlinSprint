package lesson_9

fun main() {
    val eggsPerPortion = 2
    val milkPerPortion = 50
    val butterPerPortion = 15

    val ingredientsPerPortion = listOf(eggsPerPortion, milkPerPortion, butterPerPortion)

    println("Введите количество порций омлета:")
    val portions = readln().toInt()

    val totalIngredients = ingredientsPerPortion.map { it * portions }

    println("На $portions порций вам понадобится:")
    println("Яиц – ${totalIngredients[0]} шт.")
    println("Молока – ${totalIngredients[1]} мл.")
    println("Сливочного масла – ${totalIngredients[2]} гр.")
}