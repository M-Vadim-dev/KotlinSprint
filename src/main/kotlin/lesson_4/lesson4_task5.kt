package lesson_4

fun main() {
    val minCrewCount = 55
    val maxCrewCount = 70
    val recommendProvisionBoxes = 50
    val recommendedCrewCount = 70

    print("Введите наличие повреждений корпуса (true/false): ")
    val damage: Boolean = readLine()?.toBoolean() ?: false

    print("Введите текущий состав экипажа: ")
    val crewCount: Int = readLine()?.toIntOrNull() ?: 0

    print("Введите количество ящиков с провизией на борту: ")
    val provisionBoxes: Int = readLine()?.toIntOrNull() ?: 0

    print("Введите благоприятность метеоусловий (true/false): ")
    val favorableWeather: Boolean = readLine()?.toBoolean() ?: false

    val sail =
        (!damage && crewCount in minCrewCount..maxCrewCount && provisionBoxes > recommendProvisionBoxes && favorableWeather) ||
                (damage && crewCount == recommendedCrewCount && favorableWeather && provisionBoxes >= recommendProvisionBoxes)

    println("Корабль может отправиться в плавание: $sail")
}