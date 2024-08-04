package lesson_11

class Forum {
    val members = mutableListOf<MemberForum>()
    val messages = mutableListOf<MessageForum>()
    var userIdCounter = 1

    fun createNewUser(userName: String): MemberForum {
        val newMember = MemberForum(userIdCounter++, userName)
        members.add(newMember)
        return newMember
    }

    fun createNewMessage(authorId: Int, message: String) {
        if (members.any { it.userId == authorId }) {
            val newMessage = MessageForum(authorId, message)
            messages.add(newMessage)
        } else println("Ошибка: Автор с ID $authorId не найден.")
    }

    fun printThread() {
        messages.forEach { message ->
            val author = members.find { it.userId == message.authorId }
            println("${author?.userName}: ${message.message}")
        }
    }
}

class MemberForum(
    val userId: Int,
    val userName: String,
)

class MessageForum(
    val authorId: Int,
    val message: String,
)

fun main() {
    val forum = Forum()

    forum.createNewUser("Алексей")
    forum.createNewUser("Мария")

    forum.createNewMessage(1, "Привет, Мария!")
    forum.createNewMessage(1, "Как дела?")
    forum.createNewMessage(2, "Привет, Алексей!")
    forum.createNewMessage(2, "Все отлично!")

    forum.printThread()
}