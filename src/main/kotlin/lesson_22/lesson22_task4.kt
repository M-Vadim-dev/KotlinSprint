package lesson_22

data class MainScreenState(
    val data: String = "",
    val isLoading: Boolean = false
)

class MainScreenViewModel {
    private var mainScreenState = MainScreenState()

    fun loadData() {
        // загрузка данных
        mainScreenState = mainScreenState.copy(isLoading = true)

        // имитация сетевого запроса
        val fetchedData = retrieveDataFromServer()

        mainScreenState = if (fetchedData.isEmpty()) MainScreenState() // отсутствие данных
        else MainScreenState(data = fetchedData, isLoading = false) // наличие загруженных данных

    }

    private fun retrieveDataFromServer(): String = "Загруженные данные с сервера"
}

fun main() {
    val viewModel = MainScreenViewModel()

    println("Загрузка данных...")
    viewModel.loadData()
}
