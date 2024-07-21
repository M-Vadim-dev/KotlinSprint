package lesson_4

fun main() {
    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 100

    val cargo1Weight = 20
    val cargo1Volume = 80
    val cargo2Weight = 50
    val cargo2Volume = 100

    println(
        "Груз с весом $cargo1Weight кг и объемом $cargo1Volume л соответствует категории \"Average\": " +
                (!(cargo1Weight > minWeight && cargo1Weight <= maxWeight) && cargo1Volume < maxVolume)
    )

    println(
        "Груз с весом $cargo2Weight кг и объемом $cargo2Volume л соответствует категории \"Average\": " +
                (!(cargo2Weight > minWeight && cargo2Weight <= maxWeight) && cargo2Volume < maxVolume)
    )
}