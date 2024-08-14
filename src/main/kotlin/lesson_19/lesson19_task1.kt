package lesson_19

fun main() {
    printAvailableFishes()
}

enum class FishType(val displayName: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}

fun printAvailableFishes() {
    println("Доступные рыбки в аквариум:")
    for (fish in FishType.entries) {
        println("- ${fish.displayName}")
    }
}