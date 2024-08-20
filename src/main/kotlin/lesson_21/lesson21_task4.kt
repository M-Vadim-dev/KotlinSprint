package lesson_21

import java.io.File

fun File.writeToStart(text: String) {
    val existingContent = this.readText()
    val newText = text.lowercase()
    this.writeText("$newText\n$existingContent")
}

fun main() {
    val file = File("words.txt")
    file.createNewFile()

    file.writeText(("Привет, мир!").lowercase())
    file.writeToStart("Мир, привет! :)")

    println(file.readText())
}