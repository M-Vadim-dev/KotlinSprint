package lesson_16

class Order(private val orderNumber: String) {
    private var status: String = "Новый"

    fun requestStatusChange(newStatus: String) {
        if (sendRequestToManager(newStatus)) {
            updateStatus(newStatus)
        }
    }

    private fun sendRequestToManager(newStatus: String): Boolean {
        println("Заявка на изменение статуса на \"$newStatus\".")
        return true
    }

    private fun updateStatus(newStatus: String) {
        status = newStatus
        println("Статус заказа обновлён на \"$status\".")
    }

    fun getOrderNumber(): String {
        return orderNumber
    }

    fun getStatus(): String {
        return status
    }
}

fun main() {
    val order = Order("111")

    println("Номер заказа: ${order.getOrderNumber()}")
    println("Текущий статус: ${order.getStatus()}")
    order.requestStatusChange("В обработке")
    println("Обновлённый статус: ${order.getStatus()}")
    order.requestStatusChange("Завершён")
    println("Обновлённый статус: ${order.getStatus()}")
}