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

    val (name, description, dateTime, distanceFromEarthLightYears) = alphaCentauri

    println("Название: $name\nОписание: $description\nДата и время: $dateTime\nРасстояние от Земли: $distanceFromEarthLightYears световых лет")
}