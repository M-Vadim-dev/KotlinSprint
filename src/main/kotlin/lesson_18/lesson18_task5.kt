package lesson_18

abstract class Shape(val x: Float, val y: Float) {
    abstract fun draw()
}

class Point(x: Number, y: Number) : Shape(x.toFloat(), y.toFloat()) {
    override fun draw() = println("Рисуем точку в координатах ($x, $y)")
}

class Square(x: Number, y: Number, private val sideLength: Number) : Shape(x.toFloat(), y.toFloat()) {
    override fun draw() = println("Рисуем квадрат с центром в ($x, $y) и длиной стороны $sideLength")
}

class Circle(x: Number, y: Number, private val radius: Number) : Shape(x.toFloat(), y.toFloat()) {
    override fun draw() = println("Рисуем круг с центром в ($x, $y) и радиусом $radius")
}

class Screen {
    private val shapes = mutableListOf<Shape>()

    fun draw(x: Number, y: Number, shapeType: String, size: Number) {
        val shape = when (shapeType.lowercase()) {
            "точка" -> Point(x, y)
            "квадрат" -> Square(x, y, size)
            "круг" -> Circle(x, y, size)
            else -> throw IllegalArgumentException("Некорректный тип фигуры: $shapeType")
        }
        shapes.add(shape)
        shape.draw()
    }
}

fun main() {
    val screen = Screen()
    screen.draw(1, 2, "точка", 0)
    screen.draw(3.0f, 4.0f, "квадрат", 5)
    screen.draw(5, 6, "круг", 2.5f)
}