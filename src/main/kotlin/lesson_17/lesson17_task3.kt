package lesson_17

class Folder(
    private val _name: String,
    private var _fileCount: Int,
    private var isSecret: Boolean
) {
    val name: String
        get() = if (isSecret) "скрытая папка" else _name

    private val fileCount: Int
        get() = if (isSecret) 0 else _fileCount

    fun displayInfo() {
        println("Информация о папке:")
        println("Имя папки: $name")
        println("Количество файлов: $fileCount")
        println("Is Secret: $isSecret")
    }
}

fun main() {
    val secretFolder = Folder("Личные документы", 10, true)

    secretFolder.displayInfo()
}