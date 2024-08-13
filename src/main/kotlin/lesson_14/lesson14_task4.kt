package lesson_14

open class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isSuitableForLanding: Boolean
)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean
) : CelestialBody(name, hasAtmosphere, isSuitableForLanding) {

    private val satellites: MutableList<Satellite> = mutableListOf()

    fun addSatellite(satellite: Satellite) {
        satellites.add(satellite)
    }

    fun listSatellites(): List<String> = satellites.map { it.name }


    fun displayInfo() {
        println("Планета: $name")
        if (satellites.isNotEmpty()) println("Спутники: ${listSatellites().joinToString(", ")}")
        else println("Нет спутников.")
    }
}

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean
) : CelestialBody(name, hasAtmosphere, isSuitableForLanding)

fun main() {
    val earth = Planet("Земля", true, true)

    val moon = Satellite("Луна", false, false)
    val phobos = Satellite("Фобос", false, false)

    earth.addSatellite(moon)
    earth.addSatellite(phobos)

    earth.displayInfo()
}
