package lesson_15

abstract class Forum(val username: String) {

    fun readForum() {
        println("$username читает форум.")
    }

    abstract fun writeMessage(message: String)
}

class RegularUser(username: String) : Forum(username) {

    override fun writeMessage(message: String) {
        println("$username написал сообщение: \"$message\"")
    }
}

class AdminUser(username: String) : Forum(username) {

    override fun writeMessage(message: String) {
        println("$username написал сообщение от имени администратора: \"$message\"")
    }

    fun deleteMessage(messageId: Int) {
        println("$username удалил сообщение с ID: $messageId")
    }

    fun deleteUser(user: RegularUser) {
        println("$username удалил пользователя: ${user.username}")
    }
}

fun main() {
    val user1 = RegularUser("User1")
    val admin1 = AdminUser("Admin1")

    user1.readForum()
    user1.writeMessage("Сообщение обычного пользователя.")

    admin1.readForum()
    admin1.writeMessage("Сообщение от администратора.")
    admin1.deleteMessage(101)
    admin1.deleteUser(user1)
}
