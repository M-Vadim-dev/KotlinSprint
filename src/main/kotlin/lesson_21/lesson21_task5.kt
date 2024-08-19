package lesson_21

fun Map<String, Int>.maxCategory(): String = this.maxBy { it.value }.key

fun main() {
    val skills = mapOf(
        "Стрельба" to 150,
        "Бег" to 200,
        "Магия" to 200,
        "Бой" to 120,
    )

    val maxSkill = skills.maxCategory()
    println("Навык с максимальным опытом: $maxSkill")
}