package lesson_22

class RegularBookNew(val title: String, val author: String)

data class DataBookNew(val title: String, val author: String)

fun main() {
    val book1 = RegularBookNew("1984", "George Orwell")
    val dataBook1 = DataBookNew("1984", "George Orwell")

    println("RegularBookNew: $book1")  // ссылка на объект
    println("DataBookNew: $dataBook1") // содержимое свойств

    /*
    - для класса RegularBookNew при печати объекта выводится ссылка на объект в формате "Класс@Ссылка"
    - для класса DataBookNew, поскольку это data class, выводится строка, содержащая значения свойств
    */
}