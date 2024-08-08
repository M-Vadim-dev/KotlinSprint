package lesson_14

abstract class Figure(val color: String) {
    abstract fun square(): Int
    abstract fun perimeter(): Int

}

class Circle(color: String, private val radius: Double) : Figure(color) {
    override fun square(): Int = (Math.PI * radius * radius).toInt()
    override fun perimeter(): Int = (2 * Math.PI * radius).toInt()
}

class Rectangle(color: String, private val width: Double, private val height: Double) : Figure(color) {
    override fun square(): Int = (width * height).toInt()
    override fun perimeter(): Int = (2 * (width + height)).toInt()
}

fun main() {
    val figures = mutableListOf<Figure>()

    figures.add(Circle("черный", 5.0))
    figures.add(Rectangle("белый", 4.0, 6.0))
    figures.add(Circle("белый", 3.0))
    figures.add(Rectangle("черный", 2.0, 8.0))

    val blackPerimeterSum = figures
        .filter { it.color == "черный" }
        .sumOf { it.perimeter() }

    val whiteSquareSum = figures
        .filter { it.color == "белый" }
        .sumOf { it.square() }

    println("Сумма периметров всех черных фигур: $blackPerimeterSum")
    println("Сумма площадей всех белых фигур: $whiteSquareSum")
    println()

    figures.forEach { figure ->
        println("Фигура: ${figure::class.simpleName}, Цвет: ${figure.color}")
        println("Площадь: ${figure.square()}")
        println("Периметр: ${figure.perimeter()}")
        println()
    }
}