package lesson_22

class RegularBook(val title: String, val author: String)

data class DataBook(val title: String, val author: String)


fun main() {
    val book1 = RegularBook("1984", "George Orwell")
    val book2 = RegularBook("1984", "George Orwell")

    val dataBook1 = DataBook("1984", "George Orwell")
    val dataBook2 = DataBook("1984", "George Orwell")

    println("RegularBook сравнение: ${book1 == book2}") // оператор сравнения сравнивает ссылки на объекты
    println("DataBook сравнение: ${dataBook1 == dataBook2}") // сравнение идет по содержимому свойств

}