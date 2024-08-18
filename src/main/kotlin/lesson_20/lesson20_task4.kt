package lesson_20

fun main() {
    val elements = listOf("Элемент 1", "Элемент 2", "Элемент 3", "Элемент 4", "Элемент 5")

    val actions = elements.map { element: String -> { println("Нажат элемент $element") } }

    actions.filterIndexed { index, _ -> index % 2 == 1 }.forEach { it() }
}