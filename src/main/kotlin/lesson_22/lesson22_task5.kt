package lesson_22

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: String,
    val distanceFromEarthLightYears: Double,
)

fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Alpha Centauri",
        description = "Ближайшая звездная система к Земле, состоящая из трех звезд",
        dateTime = "20.08.2024 12:00",
        distanceFromEarthLightYears = 4.367,
    )

    println("Название: ${alphaCentauri.component1()}\nОписание: ${alphaCentauri.component2()}\nДата и время: ${alphaCentauri.component3()}\nРасстояние от Земли: ${alphaCentauri.component4()} световых лет")
}