package lesson_14

open class Message(
    val id: String,
    val author: String,
    val text: String
)

class ChildMessage(
    id: String,
    author: String,
    text: String,
    val parentMessageId: String
) : Message(id, author, text)

class Chat {
    private val messages = mutableListOf<Message>()

    fun addMessage(text: String, author: String) {
        val messageId = generateId()
        val message = Message(messageId, author, text)
        messages.add(message)
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: String) {
        val messageId = generateId()
        val childMessage = ChildMessage(messageId, author, text, parentMessageId)
        messages.add(childMessage)
    }

    fun printChat() {
        val groupedMessages = messages.groupBy {
            when (it) {
                is ChildMessage -> it.parentMessageId
                else -> it.id
            }
        }

        groupedMessages.forEach { (key, msgs) ->
            msgs.forEach { msg ->
                when (msg) {
                    is Message -> println("Message [ID: ${msg.id}, Author: ${msg.author}]: ${msg.text}")
                    is ChildMessage -> println("ChildMessage [ID: ${msg.id}, Author: ${msg.author}]: ${msg.text}")
                }
            }
        }
    }

    private fun generateId() = System.currentTimeMillis().toString() + (messages.size + 1)
}
