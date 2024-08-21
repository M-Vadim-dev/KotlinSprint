package lesson_22

data class MainScreenState(
    val data: String = "",
    val isLoading: Boolean = false
)

class MainScreenViewModel {
    private var mainScreenState = MainScreenState()

    fun loadData() {
        // начало загрузки данных
        mainScreenState = mainScreenState.copy(isLoading = true)
        println("Загрузка данных...")

        // имитация сетевого запроса
        val fetchedData = retrieveDataFromServer()
        println("Промежуточное состояние: $mainScreenState")

        mainScreenState = if (fetchedData.isEmpty()) {
            println("Отсутствие данных.")
            MainScreenState()

        } else {
            println("Наличие загруженных данных: $fetchedData")
            MainScreenState(data = fetchedData, isLoading = false)
        }

        println("Окончание процесса загрузки: $mainScreenState")
    }

    private fun retrieveDataFromServer(): String = "Загруженные данные с сервера"
}

fun main() {
    val viewModel = MainScreenViewModel()

    viewModel.loadData()
}