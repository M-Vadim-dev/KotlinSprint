package lesson_14

open class Message(val id: String, val author: String, val text: String)

class ChildMessage(
    id: String,
    author: String,
    text: String,
    val parentMessageId: String,
) : Message(id, author, text)

class Chat {
    private val messages = mutableListOf<Message>()

    fun addMessage(text: String, author: String): String {
        val messageId = generateId()
        val message = Message(messageId, author, text)
        messages.add(message)
        return messageId
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: String) {
        val messageId = generateId()
        messages.add(ChildMessage(messageId, author, text, parentMessageId))
    }

    fun printChat() {
        messages.groupBy { if (it is ChildMessage) it.parentMessageId else it.id }
            .forEach { (key, msgs) ->
                msgs.forEach { msg ->
                    println("${if (msg is ChildMessage) "ChildMessage" else "Message"} [ID: ${msg.id}, Автор: ${msg.author}]: ${msg.text}")
                }
            }
    }

    private fun generateId() = System.currentTimeMillis().toString() + (messages.size + 1)
}

fun main() {
    val chat = Chat()

    val message1Id = chat.addMessage("Привет всем!", "Вадим")
    val message2Id = chat.addMessage("Как дела?", "Мария")

    chat.addThreadMessage("Привет", "Федор", message1Id)
    chat.addThreadMessage("Отлично, а у тебя?", "Игорь", message2Id)

    chat.printChat()
}