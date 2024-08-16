package lesson_18

abstract class Box {
    abstract fun surfaceArea(): Double
}

class RectangularBox(private val length: Double, private val width: Double, private val height: Double) : Box() {
    override fun surfaceArea(): Double = 2 * (length * (width + height) + width * height)
}

class Cube(private val edge: Double) : Box() {
    override fun surfaceArea(): Double = 6 * Math.pow(edge, 2.0)
}

fun main() {
    val rectangularBox = RectangularBox(2.0, 3.0, 4.0)
    println("Площадь поверхности прямоугольной коробки: ${rectangularBox.surfaceArea()}")

    val cube = Cube(3.0)
    println("Площадь поверхности куба: ${cube.surfaceArea()}")
}