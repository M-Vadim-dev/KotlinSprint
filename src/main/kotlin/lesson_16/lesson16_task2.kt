package lesson_16

class Circle(private val radius: Double) {

    private companion object {
        const val PI = 3.14
    }

    fun circumference(): Double = 2 * PI * radius

    fun area(): Double = PI * radius * radius
}

fun main() {
    val circle = Circle(5.0)
    val circumference = circle.circumference()
    val area = circle.area()

    println("Длина окружности: $circumference")
    println("Площадь круга: $area")
}