package lesson_11

class Participant(
    val userName: String,
    val avatar: String,
    var status: String,
)

class Room(
    val cover: String,
    val name: String,
    val participants: MutableList<Participant> = mutableListOf(),
) {

    // добавить участника
    fun addParticipant(participant: Participant) {
        participants.add(participant)
    }

    // обновить статус
    fun updateStatus(userName: String, newStatus: String) {
        val participant = participants.find { it.userName == userName }
        participant?.status = newStatus
    }

    // возвращает список участников с их статусами
    fun getParticipantsStatus() = participants.map { it.userName to it.status }
}

fun main() {
    val room = Room(cover = "cover.jpg", name = "Комната по интересам")

    room.addParticipant(Participant("Nastya", "nastya.jpg", "разговаривает"))
    room.addParticipant(Participant("Dima", "dima.jpg", "микрофон выключен"))

    room.updateStatus("Nastya", "пользователь заглушен")

    println(room.getParticipantsStatus())
}
